package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IDishDao;
import cn.mrx.food.dao.impl.DishDaoImpl;
import cn.mrx.food.domain.Dish;
import cn.mrx.food.exception.FoodException;
import cn.mrx.food.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DishServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/10 16:46
 * @Description:
 * @Version 1.0
 */
@Service
public class DishServiceImpl extends BaseServiceImpl<DishDaoImpl, Dish> implements IDishService {

    @Autowired
    private IDishDao iDishDao;

    /**
     * 根据食堂id查询对应的菜品
     * @param id
     * @return
     */
    @Override
    public Object selectCanteens(Integer id) {
        try{
            return iDishDao.selectCanteens(id);
        }catch (Exception e){
            throw new FoodException("根据食堂id查询对应的菜品出现异常！");
        }
    }
}
