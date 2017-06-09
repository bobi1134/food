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

    /**
     * 根据id加载一个实体
     * @param id
     * @param <T>
     * @return
     */
    public <T> T load(Integer id);

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
    public <T> List<T> selectLimit(Integer num);

    /**
     * 根据id获取一个实体
     * @param id
     * @param <T>
     * @return
     */
    public <T> T get(Integer id);

    /**
     * 保存实体
     * @param t
     * @return
     */
    public Integer save(T t);

}
