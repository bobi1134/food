package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IBaseDao;
import cn.mrx.food.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: BaseServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 20:34
 * @Description:
 * @Version 1.0
 */
@Transactional
public class BaseServiceImpl<M extends IBaseDao<T>, T> implements IBaseService<T> {

    @Autowired
    private M iBaseDao;

    public List<T> loadAll(){
        return iBaseDao.loadAll();
    }

    @Override
    public Integer save(T t) {
        return iBaseDao.save(t);
    }
}
