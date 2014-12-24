package com.baidu.bdg.udw;

import org.apache.hadoop.io.Text;

import static junit.framework.Assert.assertEquals;

/**
 * Base64Decoder Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 23, 2014</pre>
 */
public class Base64DecoderTest {
    Base64Decoder decoder = new Base64Decoder();

    public void before() throws Exception {
    }

    public void after() throws Exception {
    }

    public void testEvaluate() throws Exception {
        Text data = new Text("YmFzZTY05Zyo57q/6Kej56CBAAAAAAA=");
        Text res = decoder.evaluate(data);
        assertEquals("base64在线解码", res.toString().trim());
    }


} 
