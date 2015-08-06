package com.caretmu.common.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by darchrow on 8/6/15.
 */
public class CodeUtils {

    public static String MD5(String param){
        String md5Value = null;
        if(StringUtils.isNotBlank(param)){
            md5Value = DigestUtils.md5Hex(param);
        }
        return md5Value;
    }

    public static String MD5ToUpperCase(String param){
        if(StringUtils.isNotBlank(param)){
            return MD5(param).toUpperCase();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(MD5ToUpperCase("admin"));
    }
}
