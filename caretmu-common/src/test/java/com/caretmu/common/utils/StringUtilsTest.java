package com.caretmu.common.utils;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by darchrow on 8/1/15.
 */
public class StringUtilsTest {

    @Test
    public void isBlank(){
        assertTrue(StringUtils.isBlank("  "));
    }

    @Test
    public void isNotBlank(){
        assertTrue(StringUtils.isNotBlank("oookk"));
    }
}
