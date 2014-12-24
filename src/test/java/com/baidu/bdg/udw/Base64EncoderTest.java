package com.baidu.bdg.udw;

import org.apache.hadoop.io.Text;

import static junit.framework.Assert.assertEquals;

/**
 * Base64Encoder Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 23, 2014</pre>
 */
public class Base64EncoderTest {

    Base64Encoder encoder = new Base64Encoder();

    public void before() throws Exception {

    }

    public void after() throws Exception {
    }

    public void testEvaluate() throws Exception {
        Text data = new Text("base64在线解码");
        Text res = encoder.evaluate(data);
        assertEquals("YmFzZTY05Zyo57q/6Kej56CBAAAAAAA=", res.toString());
    }


} 
