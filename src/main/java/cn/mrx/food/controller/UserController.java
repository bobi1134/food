package cn.mrx.food.controller;

import cn.mrx.food.domain.User;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: UserController
 * @Author: Mr.X
 * @Date: 2017/6/7 17:54
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/user/")
public class UserController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public Object login(User user){
        List<User> users = iUserService.selectUser(user.getEmail(), user.getPwd());
        if(users.size() == 1) {
            return users.get(0);
        }else{
            User newUser = new User();
            newUser.setId(-1);
            return newUser;
        }
    }

    /**
     * 根据id查询该用户
     * @param id
     * @return
     */
    @PostMapping("/get/{id}")
    @ResponseBody
    public Object get(@PathVariable("id") Integer id){
        return iUserService.get(id);
    }
}
