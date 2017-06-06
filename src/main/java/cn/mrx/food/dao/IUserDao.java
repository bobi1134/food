package cn.mrx.food.dao;

import cn.mrx.food.domain.User;

/**
 * @ClassName: IUserDao
 * @Author: Mr.X
 * @Date: 2017/6/6 18:33
 * @Description:
 * @Version 1.0
 */
public interface IUserDao {

    Integer save(User user);
}
