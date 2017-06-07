package cn.mrx.food.exception;

/**
 * @ClassName: FoodException
 * @Author: Mr.X
 * @Date: 2017/6/7 17:19
 * @Description:
 * @Version 1.0
 */
public class FoodException extends RuntimeException {

    public FoodException() {
        super();
    }

    public FoodException(String message) {
        super(message);
    }

    public FoodException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoodException(Throwable cause) {
        super(cause);
    }

    protected FoodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
