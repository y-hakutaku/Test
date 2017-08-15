package com.example.fsuser.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void hoge(){
        SampleClass s = new SampleClass();
        s.setHoge("hoge");
        assertEquals("hoge",s.getHoge());
    }
}