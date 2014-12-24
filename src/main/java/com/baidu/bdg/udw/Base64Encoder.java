package com.baidu.bdg.udw;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import sun.misc.BASE64Encoder;

/**
 * Created by xujingnan on 14-12-23.
 */
public class Base64Encoder extends UDF{
    public Text evaluate(Text field) {
        Text result = null;

        if (field == null || StringUtils.isEmpty(field.toString())) {
            return result;
        }

        BASE64Encoder encoder = new BASE64Encoder();
        result = new Text();
        result.set(encoder.encode(field.getBytes()));
        return result;
    }
}
