package ru.acs.fst.router;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 10.06.2010
 * Time: 15:41:10
 * To change this template use File | Settings | File Templates.
 */
public class RouterException extends RuntimeException{
    public RouterException(Throwable cause) {
        super(cause);
    }

    public RouterException(String message, Throwable cause) {
        super(message, cause);
    }
}
