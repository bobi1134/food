package cn.mrx.food.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     * 指定获取前几条大学记录
     * @param num
     * @return
     */
    @PostMapping("/selectLimit/{num}")
    @ResponseBody
    public Object selectLimit(@PathVariable("num") Integer num){
        return iUniversityService.selectLimit(num);
    }

    /**
     * 加载所有大学
     * @return
     */
    @PostMapping("/loadAll")
    @ResponseBody
    public Object loadAll(){
        return iUniversityService.loadAll();
    }

    /**
     * 根据大学id获取对应的大学
     * @return
     */
    @PostMapping("/get/{id}")
    @ResponseBody
    public Object get(@PathVariable("id") Integer id){
        return iUniversityService.get(id);
    }
}
