package cn.mrx.food.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: UniversityController
 * @Author: Mr.X
 * @Date: 2017/6/7 17:58
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/university")
public class UniversityController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 指定查询前几条记录
     * @param num
     * @return
     */
    @PostMapping("/selectLimit/{num}")
    @ResponseBody
    public Object loadAll(@PathVariable("num") Integer num){
        return iUniversityService.selectLimit(num);
    }
}