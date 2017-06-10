package cn.mrx.food.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: CanteenController
 * @Author: Mr.X
 * @Date: 2017/6/10 16:10
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/canteen")
public class CanteenController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 根据id获取对应的食堂以及该食堂下的所有菜品
     * @return
     */
    @PostMapping("/get/{id}")
    @ResponseBody
    public Object get(@PathVariable("id") Integer id){
        return iCanteenService.get(id);
    }

}
