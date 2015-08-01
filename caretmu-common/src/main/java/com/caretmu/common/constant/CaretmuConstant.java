package com.caretmu.common.constant;

/**
 * Created by darchrow on 8/2/15.
 */
public final class CaretmuConstant {

    private CaretmuConstant(){
        throw new IllegalAccessError("illegal access constructor of " + this.getClass().getName());
    }

    public static final String SYSTEM_NAME = "caretmu-pro";
    public static final String SYSTEM_VERSION = "0.1";
}
