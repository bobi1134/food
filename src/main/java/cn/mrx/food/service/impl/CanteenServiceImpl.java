package cn.mrx.food.service.impl;

import cn.mrx.food.dao.ICanteenDao;
import cn.mrx.food.dao.impl.CanteenDaoImpl;
import cn.mrx.food.domain.Canteen;
import cn.mrx.food.exception.FoodException;
import cn.mrx.food.service.ICanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: CanteenServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/8 22:05
 * @Description:
 * @Version 1.0
 */
@Service
public class CanteenServiceImpl extends BaseServiceImpl<CanteenDaoImpl, Canteen> implements ICanteenService{

    @Autowired
    private ICanteenDao iCanteenDao;

    /**
     * 根据universityId查询对应的Canteens
     * @param id
     * @return
     */
    @Override
    public Object selectCanteens(Integer id) {
        try {
            return iCanteenDao.selectCanteens(id);
        }catch (Exception e){
            throw new FoodException("");
        }
    }
}
