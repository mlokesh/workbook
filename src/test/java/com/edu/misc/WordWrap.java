package com.edu.misc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordWrap {

    @Test
    public void wraps() throws Exception {
        assertWrap("", 1, "");
        assertWrap("x", 1, "x");
        assertWrap("xx", 1, "x\nx");
        assertWrap("xxx", 1, "x\nx\nx");
        assertWrap("xxxx", 1, "x\nx\nx\nx");
    }

    private void assertWrap(String text, int w, String expected) {
        assertThat(wrap(text, w), is(expected));
    }

    private String wrap(String s, int n) {
        if (s.length() <= n) {
            return s;
        } else
        return s.substring(0, n) + "\n" + wrap(s.substring(n), n);
    }

}
