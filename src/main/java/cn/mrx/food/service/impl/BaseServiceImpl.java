package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IBaseDao;
import cn.mrx.food.exception.FoodException;
import cn.mrx.food.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: BaseServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 20:34
 * @Description:
 * @Version 1.0
 */
public class BaseServiceImpl<M extends IBaseDao<T>, T> implements IBaseService<T> {

    @Autowired
    private M iBaseDao;

    public List<T> loadAll(){
        try {
            return iBaseDao.loadAll();
        }catch (Exception e){
            throw new FoodException("loadAll()方法出现异常！");
        }
    }

    @Override
    public Integer save(T t) {
        try {
            return iBaseDao.save(t);
        }catch (Exception e){
            throw new FoodException("save()方法出现异常！");
        }
    }
}
