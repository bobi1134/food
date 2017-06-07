package cn.mrx.food.dao;

import java.util.List;

/**
 * @ClassName: IBaseDao
 * @Author: Mr.X
 * @Date: 2017/6/6 20:35
 * @Description:
 * @Version 1.0
 */
public interface IBaseDao<T> {

    public List<T> loadAll();

    public Integer save(T t);
}
