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

    /**
     * 根据id加载一个实体
     * @param id
     * @return
     */
    public T load(Integer id);

    /**
     * 加载所有信息
     * @return
     */
    public List<T> loadAll();

    /**
     * 指定查询前几条记录
     * @param num
     * @return
     */
    public List<T> selectLimit(Integer num);

    /**
     * 根据id获取一个实体
     * @param id
     * @return
     */
    public T get(Integer id);

    /**
     * 保存实体
     * @param t
     * @return
     */
    public Integer save(T t);

    /**
     * 修改实体
     * @param t
     */
    public void update(T t);
}
