package com.caremu.domain.exception;

/**
 * Created by darchrow on 2016/1/24.
 */
public class ParameterException extends RuntimeException {

    private int errorCode;
    private String errorInfo;

    public ParameterException(int errorCode, String errorInfo) {
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }

    public ParameterException(Throwable cause, int errorCode, String errorInfo) {
        super(cause);
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}
