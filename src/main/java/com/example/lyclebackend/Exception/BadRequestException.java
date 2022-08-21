package com.example.lyclebackend.Exception;

public class BadRequestException extends RuntimeException {
    private String errorCode;

    /**
     * default 400 Error
     */

    /**
     * Error Code 지정
     * @param code
     */
    public BadRequestException(String code) {
        this.errorCode = code;
    }

    public String getErrorCode() {
        return errorCode;
    }
}