package cn.mrx.food.dao;

import cn.mrx.food.domain.Canteen;

import java.util.List;

/**
 * @ClassName: ICanteenDao
 * @Author: Mr.X
 * @Date: 2017/6/8 22:07
 * @Description:
 * @Version 1.0
 */
public interface ICanteenDao extends IBaseDao<Canteen>  {

    /**
     * 根据universityId查询对应的Canteens
     * @param id
     * @return
     */
   public Object selectCanteens(Integer id);
}
