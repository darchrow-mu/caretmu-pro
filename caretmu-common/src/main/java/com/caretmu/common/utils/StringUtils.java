package com.caretmu.common.utils;

/**
 * Created by darchrow on 8/1/15.
 */
public final class StringUtils {

    private StringUtils(){
        throw  new IllegalAccessError("Illegal access, the class name is" + this.getClass().getName());
    }

    /**
     * 判断字符串是否为 null, "", "    "这三种情形
     * @param param
     * @return
     */
    public static boolean isBlank(String param){
        int strLen;
        if (param == null || (strLen = param.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(param.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * true 的条件是存在非空字符
     * @param param
     * @return
     */
    public static boolean isNotBlank(String param){
        return !isBlank(param);
    }

    /**
     * null 或者 ”“
     * @param param
     * @return
     */
    public static boolean isEmpty(String param){
        return param == null || param.length() == 0;
    }

    /**
     * 与isEmpty 相对应
     * @param param
     * @return
     */
    public static boolean isNotEmpty(String param){
        return !isEmpty(param);
    }
}
