package cn.mrx.food.service;

import cn.mrx.food.dao.IBaseDao;
import cn.mrx.food.domain.Canteen;

import java.util.List;

/**
 * @ClassName: ICanteenService
 * @Author: Mr.X
 * @Date: 2017/6/8 22:04
 * @Description:
 * @Version 1.0
 */
public interface ICanteenService extends IBaseService<Canteen> {

    /**
     * 根据universityId查询对应的Canteens
     * @param id
     * @return
     */
    public Object selectCanteens(Integer id);
}
