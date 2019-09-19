package co.topc.exception;

/**
 * @author fantao
 * @date 2019/9/11 23:01
 */
public class TopcSmsException extends Exception {

    public TopcSmsException() {
        super();
    }

    public TopcSmsException(String message) {
        super(message);
    }

    public TopcSmsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TopcSmsException(Throwable cause) {
        super(cause);
    }

}
