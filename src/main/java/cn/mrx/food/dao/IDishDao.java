package cn.mrx.food.dao;

import cn.mrx.food.domain.Dish;

/**
 * @ClassName: IDishDao
 * @Author: Mr.X
 * @Date: 2017/6/10 16:44
 * @Description:
 * @Version 1.0
 */
public interface IDishDao extends IBaseDao<Dish> {

    /**
     * 根据食堂id查询对应的菜品
     * @param id
     * @return
     */
    public Object selectCanteens(Integer id);
}
