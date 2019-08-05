package main.com.learn.day.day5.crmBusiness.assets.exception;

import main.com.learn.extend.exception.BusinessRuntimeException;

public class FixedPropertyException extends BusinessRuntimeException {
    public FixedPropertyException(String str) {
        super(str);
    }

    public FixedPropertyException(String message, Throwable cause) {
        super(message, cause);
    }
}
