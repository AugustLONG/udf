package com.baidu.bdg.udw;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import sun.misc.BASE64Decoder;

import java.io.IOException;

/**
 * Created by xujingnan on 14-12-23.
 */
public class Base64Decoder extends UDF {
    public Text evaluate(Text field) {
        Text result = null;

        if (field == null || StringUtils.isEmpty(field.toString())) {
            return result;
        }

        BASE64Decoder decoder = new BASE64Decoder();
        result = new Text();
        try {
            result.set((decoder.decodeBuffer(field.toString())));
        } catch (IOException e) {
            result.set(field.getBytes());
        }
        return result;
    }
}
