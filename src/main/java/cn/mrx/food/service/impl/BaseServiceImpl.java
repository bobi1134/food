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

    /**
     * 根据id加载一个实体
     * @param id
     * @return
     */
    @Override
    public T load(Integer id) {
        try {
            return iBaseDao.load(id);
        }catch (Exception e){
            throw new FoodException("根据id加载一个实体出现异常！");
        }
    }

    /**
     * 加载所有信息
     * @return
     */
    public List<T> loadAll(){
        try {
            return iBaseDao.loadAll();
        }catch (Exception e){
            throw new FoodException("loadAll()方法出现异常！");
        }
    }

    /**
     * 指定查询前几条记录
     * @param num
     * @return
     */
    @Override
    public List<T> selectLimit(Integer num) {
        try {
            return iBaseDao.selectLimit(num);
        }catch (Exception e){
            throw new FoodException("指定查询前几条记录出现异常！");
        }
    }

    /**
     * 根据id获取一个实体
     * @param id
     * @return
     */
    @Override
    public T get(Integer id) {
        try {
            return iBaseDao.get(id);
        }catch (Exception e){
            throw new FoodException("根据id获取一个实体出现异常！");
        }
    }

    /**
     * 保存实体
     * @param t
     * @return
     */
    @Override
    public Integer save(T t) {
        try {
            return iBaseDao.save(t);
        }catch (Exception e){
            throw new FoodException("save()方法出现异常！");
        }
    }

    @Override
    public void update(T t) {
//        try {
            iBaseDao.update(t);
//        }catch (Exception e){
//            throw new FoodException("update()方法出现异常！");
//        }
    }
}
