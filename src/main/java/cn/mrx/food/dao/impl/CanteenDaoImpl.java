package cn.mrx.food.dao.impl;

import cn.mrx.food.dao.ICanteenDao;
import cn.mrx.food.domain.Canteen;

import java.util.List;

/**
 * @ClassName: CanteenDaoImpl
 * @Author: Mr.X
 * @Date: 2017/6/8 22:16
 * @Description:
 * @Version 1.0
 */
public class CanteenDaoImpl extends BaseDaoImpl<Canteen> implements ICanteenDao{

    /**
     * 根据universityId查询对应的Canteens
     * @param id
     * @return
     */
    @Override
    public Object selectCanteens(Integer id) {
        return getHibernateTemplate().find("from Canteen where universityId=?", new Object[]{id});
    }
}
