package com.caremu.domain.exception;

/**
 * Created by darchrow on 2016/1/24.
 */
public class BusinessException extends RuntimeException {

    private int errorCode;
    private String errorInfo;

    public BusinessException(String message, int errorCode) {
        this.errorInfo = message;
        this.errorCode = errorCode;
    }

    public BusinessException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public BusinessException(Throwable cause, int errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
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

    @Override
    public String toString() {
        return "BusinessException{" +
                "errorCode=" + errorCode +
                ", errorInfo='" + errorInfo + '\'' +
                '}';
    }
}
