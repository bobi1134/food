package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.Canteen;
import cn.mrx.food.domain.Dish;
import cn.mrx.food.service.ICanteenService;
import cn.mrx.food.service.IDishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: DishTest
 * @Author: Mr.X
 * @Date: 2017/6/10 16:43
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class DishTest {

    @Autowired
    private IDishService iDishService;

    @Test
    public void test1(){
    }
}
