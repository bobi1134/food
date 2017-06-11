package cn.mrx.food.service;

import cn.mrx.food.domain.User;

import java.util.List;

/**
 * @ClassName: IUserService
 * @Author: Mr.X
 * @Date: 2017/6/6 18:33
 * @Description:
 * @Version 1.0
 */
public interface IUserService extends IBaseService<User>{

    /**
     * 根据邮箱和密码查询用户
     * @param email
     * @param pwd
     * @return
     */
    public List<User> selectUser(String email, String pwd);
}
