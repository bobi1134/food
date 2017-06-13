package cn.mrx.food.dao.impl;

import cn.mrx.food.dao.IRemarkDao;
import cn.mrx.food.domain.Remark;

/**
 * @ClassName: RemarkDaoImpl
 * @Author: Mr.X
 * @Date: 2017/6/10 21:28
 * @Description:
 * @Version 1.0
 */
public class RemarkDaoImpl extends BaseDaoImpl<Remark> implements IRemarkDao {

    /**
     * 根据(菜品id=1|用户id=other)获取评论信息
     * @param idType
     * @param id
     * @return
     */
    @Override
    public Object selectRemarks(Integer idType, Integer id) {
        if(idType==1) return getHibernateTemplate().find("from Remark where dish_id=?", new Object[]{id});
        else return getHibernateTemplate().find("from Remark where user_id=?", new Object[]{id});
    }
}
