package cn.mrx.food.controller;

import cn.mrx.food.domain.Dish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: RemarkController
 * @Author: Mr.X
 * @Date: 2017/6/10 22:00
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/dish")
public class DishController extends BaseController{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 根据菜品id获取相应的菜品
     * @return
     */
    @PostMapping("/get/{id}")
    @ResponseBody
    public Object get(@PathVariable("id") Integer id){
        return iDishService.get(id);
    }

    /**
     * 根据食堂id查询对应的菜品
     * @param id
     * @return
     */
    @PostMapping("/selectDishes/{id}")
    @ResponseBody
    public Object selectDishes(@PathVariable("id") Integer id){
        return iDishService.selectCanteens(id);
    }

    /**
     * 点赞加1
     * @param id
     * @return
     */
    @PostMapping("/praiseNum/{id}")
    @ResponseBody
    public Object praiseNum(@PathVariable("id") Integer id){
        Dish dish = iDishService.get(id);
        dish.setPraiseNum(dish.getPraiseNum()+1);
        iDishService.update(dish);
        return iDishService.get(id);
    }
}
