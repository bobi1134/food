package cn.mrx.food.utils;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @ClassName: ResultModel
 * @Author: Mr.X
 * @Date: 2017/6/7 17:52
 * @Description:
 * @Version 1.0
 */
public class ResultModel {
    public final static int CODE_SUCCESS = 0;//成功
    public final static int CODE_EXCEPTION = 500;//异常
    public final static int CODE_FAILED = 1;//失败
    public final static int CODE_LOGOUT = 600;//用户未登录或者token失效
    public final static int MISSING_SERVLET_REQUEST_PARAMETER_CODE = 400;//请求参数不足
    public final static int ERROR_SERVLET_REQUEST_PARAMETER_CODE = 401;//请求参数不足
    public final static int TARGET_NOT_EXIST_CODE = 402;//目标不存在

    private int code;
    private String message;
    private Object data;

    public ResultModel() {
        code = CODE_SUCCESS;
        message = "OK";
    }

    public static ResultModel newErrorResult (){
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(500);
        resultModel.setMessage("系统繁忙！");
        return resultModel;
    }

    public ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
