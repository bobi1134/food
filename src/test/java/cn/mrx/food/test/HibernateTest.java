package cn.mrx.food.test;

import cn.mrx.food.domain.User;
import cn.mrx.food.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: HibernateTest
 * @Author: Mr.X
 * @Date: 2017/5/31 22:54
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class HibernateTest {

    @Autowired
    private IUserService iUserService;

    /**
     * 插入测试 & 事务测试
     */
    @Test
    public void test2(){
        System.out.println("-------------------------------");
        User user = new User();
        user.setUserName("user-2");
        Integer res = iUserService.save(user);
        System.out.println(res);
    }
}
