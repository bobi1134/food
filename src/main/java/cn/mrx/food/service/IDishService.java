package cn.mrx.food.service;

import cn.mrx.food.domain.Dish;

/**
 * @ClassName: IDishService
 * @Author: Mr.X
 * @Date: 2017/6/10 16:46
 * @Description:
 * @Version 1.0
 */
public interface IDishService extends IBaseService<Dish> {

    /**
     * 根据食堂id查询对应的菜品
     * @param id
     * @return
     */
    public Object selectCanteens(Integer id);
}
