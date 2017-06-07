package cn.mrx.food.service;

import java.util.List;

/**
 * @ClassName: IBaseService
 * @Author: Mr.X
 * @Date: 2017/6/6 20:34
 * @Description:
 * @Version 1.0
 */
public interface IBaseService<T> {

    public List<T> loadAll();

    public Integer save(T t);
}
