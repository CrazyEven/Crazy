package main.com.learn.extend.exception;

/**
 * 基础runtime exception
 *
 * @author luffy
 * @date 15/5/4
 */
public class BusinessRuntimeException extends RuntimeException {

    protected ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return errorCode;
    }
    public BusinessRuntimeException(Throwable cause) {
        super(cause);
    }

    public BusinessRuntimeException() {
        this(ErrorCodes.UNKNOWN_ERROR);
    }

    public BusinessRuntimeException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage());
    }

    public BusinessRuntimeException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public BusinessRuntimeException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public BusinessRuntimeException(String message) {
        this(ErrorCodes.UNKNOWN_ERROR, message);
    }

    public BusinessRuntimeException(String message, Throwable cause) {
        this(ErrorCodes.UNKNOWN_ERROR, message, cause);
    }
    public BusinessRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

