package cn.mrx.food.dao.impl;

import cn.mrx.food.dao.IBaseDao;
import cn.mrx.food.dao.IUserDao;
import cn.mrx.food.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 18:34
 * @Description:
 * @Version 1.0
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

    /**
     * 根据邮箱和密码查询用户
     * @param email
     * @param pwd
     * @return
     */
    @Override
    public List<User> selectUser(String email, String pwd) {
        return (List<User>) getHibernateTemplate().find("from User where email=? and pwd=?", new Object[]{email, pwd});
    }
}
