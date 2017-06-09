package cn.mrx.food.service.impl;

import cn.mrx.food.dao.impl.CanteenDaoImpl;
import cn.mrx.food.domain.Canteen;
import cn.mrx.food.service.ICanteenService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CanteenServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/8 22:05
 * @Description:
 * @Version 1.0
 */
@Service
public class CanteenServiceImpl extends BaseServiceImpl<CanteenDaoImpl, Canteen> implements ICanteenService{
}
