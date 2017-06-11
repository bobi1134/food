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
        User user = new User();
        user.setEmail("jxjy.ing@foxmail.com");
        user.setNickName("Mr.X");
        user.setPwd("111111");
        user.setRole(1);
        user.setEnabled(1);
        System.out.println("---->"+iUserService.save(user));

        user.setEmail("1451965355@qq.com");
        user.setNickName("Old friend");
        user.setPwd("111111");
        user.setRole(2);
        user.setEnabled(1);
        System.out.println("---->"+iUserService.save(user));

        user.setEmail("admin@qq.com");
        user.setNickName("Admin");
        user.setPwd("111111");
        user.setRole(2);
        user.setEnabled(1);
        System.out.println("---->"+iUserService.save(user));

        user.setEmail("test1@qq.com");
        user.setNickName("测试账号1");
        user.setPwd("111111");
        user.setRole(3);
        user.setEnabled(1);
        System.out.println("---->"+iUserService.save(user));

        user.setEmail("test2@qq.com");
        user.setNickName("测试账号2");
        user.setPwd("111111");
        user.setRole(3);
        user.setEnabled(-1);
        System.out.println("---->"+iUserService.save(user));

        user.setEmail("test3@qq.com");
        user.setNickName("测试账号3");
        user.setPwd("111111");
        System.out.println("---->"+iUserService.save(user));

    }

    /**
     * 查询
     */
    @Test
    public void test2(){
        List<User> users = iUserService.loadAll();
        for (User user : users){
            System.out.println("------>"+user.getEmail());
        }
    }

    @Test
    public void test3(){
        List<User> users = iUserService.selectUser("11451965355@qq.com", "111111");
        if(users.size() == 1){
            System.out.println("---->"+users.get(0).getNickName());
        }else{
            System.out.println("---->"+"no ... ");
        }
    }

}
