package cn.mrx.food.dao.impl;

import cn.mrx.food.dao.IDishDao;
import cn.mrx.food.domain.Dish;

/**
 * @ClassName: DishDaoImpl
 * @Author: Mr.X
 * @Date: 2017/6/10 16:45
 * @Description:
 * @Version 1.0
 */
public class DishDaoImpl extends BaseDaoImpl<Dish> implements IDishDao {

    /**
     * 根据食堂id查询对应的菜品
     * @param id
     * @return
     */
    @Override
    public Object selectCanteens(Integer id) {
        return getHibernateTemplate().find("from Dish where canteenId=?", new Object[]{id});
    }
}
