package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.University;
import cn.mrx.food.domain.User;
import cn.mrx.food.service.IUniversityService;
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

    @Autowired
    private IUniversityService iUniversityService;

    /**
     * 插入查询
     */
    @Test
    public void test1(){
        List<User> users = iUserService.loadAll();
        for (User user : users){
            System.out.println("------>"+user.getUserName());
        }
        List<University> universities = iUniversityService.loadAll();
        for (University university : universities){
            System.out.println("------>"+university.getUniversityName());
        }
    }

    /**
     * 插入测试 & 事务测试
     */
    @Test
    public void test2(){
//        University university = new University();
//        university.setUniversityName("川北医学院");
//        Integer res = iUniversityService.save(university);
//        System.out.println("----------->"+res);


        User user = new User();
        user.setUserName("admin");
        Integer res = iUserService.save(user);
        System.out.println("----------->"+res);
    }
}
