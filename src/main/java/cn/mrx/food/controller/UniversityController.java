package cn.mrx.food.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/loadAll")
    @ResponseBody
    public Object loadAll(){
        return iUniversityService.loadAll();
    }
}
