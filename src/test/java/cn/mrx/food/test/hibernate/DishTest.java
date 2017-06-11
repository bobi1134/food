package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.Canteen;
import cn.mrx.food.domain.Dish;
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
        Dish dish = new Dish();
        //川农特色菜1
        dish.setDishName("泡椒鱼皮");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农特色菜2
        dish.setDishName("皮蛋鸭卷");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农特色菜3
        dish.setDishName("泰味凤爪");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农特色菜4
        dish.setDishName("沙田蜜柚柚子皮");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农蔬菜类1
        dish.setDishName("飘儿白");
        dish.setDishType(2);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农蔬菜类2
        dish.setDishName("莲花白");
        dish.setDishType(2);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农肉类1
        dish.setDishName("小炒肉");
        dish.setDishType(3);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川农小吃类1
        dish.setDishName("川味香肠");
        dish.setDishType(4);
        dish.setCanteenId(1);
        System.out.println("---->"+iDishService.save(dish));
        //川大特色菜1
        dish.setDishName("李庄白肉");
        dish.setDishType(1);
        dish.setCanteenId(5);
        System.out.println("---->"+iDishService.save(dish));
    }

    @Test
    public void test2(){
        Dish dish = iDishService.get(1);
        dish.setPraiseNum(dish.getPraiseNum()+1);
        iDishService.update(dish);
    }
}
