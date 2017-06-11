package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IUserDao;
import cn.mrx.food.dao.impl.UserDaoImpl;
import cn.mrx.food.domain.User;
import cn.mrx.food.exception.FoodException;
import cn.mrx.food.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 18:33
 * @Description:
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDaoImpl, User> implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    /**
     * 根据邮箱和密码查询用户
     * @param email
     * @param pwd
     * @return
     */
    @Override
    public List<User> selectUser(String email, String pwd) {
        try {
            return iUserDao.selectUser(email, pwd);
        }catch (Exception e){
            throw new FoodException("根据邮箱和密码查询用户出现异常！");
        }
    }
}
