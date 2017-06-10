package cn.mrx.food.controller;

import cn.mrx.food.service.*;
import cn.mrx.food.utils.ResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: BaseController
 * @Author: Mr.X
 * @Date: 2017/6/7 17:52
 * @Description:
 * @Version 1.0
 */
public class BaseController {

    protected Logger baseLog = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    @Autowired
    protected IUserService iUserService;

    @Autowired
    protected IUniversityService iUniversityService;

    @Autowired
    protected ICanteenService iCanteenService;

    @Autowired
    protected IDishService iDishService;

    /**
     * 必须的参数不足时异常处理
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public Object exception(MissingServletRequestParameterException e) {
        e.printStackTrace();
        //ajax请求
        if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
            baseLog.debug(e.getMessage());
            e.printStackTrace();
            ResultModel rm = new ResultModel();
            //请求参数不足
            rm.setCode(ResultModel.CODE_EXCEPTION);
            rm.setMessage("系统开小差了，请重新进入页面后再试！");
            return rm;
        }else{
            //非ajax请求
            return new ModelAndView("web/500");
        }
    }

    /**
     * 当出现异常时，采用统一返回
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler({Exception.class})
    public Object exception(Exception e) {
        e.printStackTrace();
        //ajax请求
        if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
            baseLog.debug(e.getMessage());
            e.printStackTrace();
            ResultModel rm = new ResultModel();
            //请求参数不足
            rm.setCode(ResultModel.CODE_EXCEPTION);
            rm.setMessage("系统忙，请稍后再试！");
            return rm;
        }else{
            //非ajax请求
            return new ModelAndView("web/500");
        }
    }
}
