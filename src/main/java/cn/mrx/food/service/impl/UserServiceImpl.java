package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IUserDao;
import cn.mrx.food.domain.User;
import cn.mrx.food.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 18:33
 * @Description:
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired private IUserDao iUserDao;

    @Override
    public Integer save(User user) {
        return iUserDao.save(user);
    }
}
