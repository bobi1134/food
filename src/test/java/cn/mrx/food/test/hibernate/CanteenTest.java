package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.Canteen;
import cn.mrx.food.service.ICanteenService;
import cn.mrx.food.service.IUniversityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: CanteenTest
 * @Author: Mr.X
 * @Date: 2017/6/9 15:36
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class CanteenTest {

    @Autowired
    private ICanteenService iCanteenService;

    @Test
    public void test1(){
        System.out.println("---->"+iCanteenService.get(1));
    }
}
