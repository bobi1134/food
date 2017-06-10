package cn.mrx.food.service.impl;

import cn.mrx.food.dao.impl.DishDaoImpl;
import cn.mrx.food.domain.Dish;
import cn.mrx.food.service.IDishService;
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
}
