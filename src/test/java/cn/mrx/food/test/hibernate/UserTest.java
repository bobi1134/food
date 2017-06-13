package cn.mrx.food.test.hibernate;

import cn.mrx.food.dao.IBaseDao;
import cn.mrx.food.domain.Canteen;
import cn.mrx.food.domain.University;
import cn.mrx.food.domain.User;
import cn.mrx.food.service.ICanteenService;
import cn.mrx.food.service.IUniversityService;
import cn.mrx.food.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: UserTest
 * @Author: Mr.X
 * @Date: 2017/5/31 22:54
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class UserTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void test1(){
        List<User> users = iUserService.loadAll();
        for (User user : users){
            System.out.println("------>"+user.getEmail());
        }
    }
}
