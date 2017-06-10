package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.Remark;
import cn.mrx.food.domain.User;
import cn.mrx.food.service.IRemarkService;
import cn.mrx.food.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: RemarkTest
 * @Author: Mr.X
 * @Date: 2017/6/10 21:32
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class RemarkTest {

    @Autowired
    private IRemarkService iRemarkService;

    @Autowired
    private IUserService iUserService;

    @Test
    public void test1(){
        Remark remark = new Remark();
        remark.setRemarkContent("哈哈哈！好吃！");
        remark.setDishId(1);
        remark.setUser(iUserService.get(1));
        System.out.println("---->"+iRemarkService.save(remark));

//        remark.setRemarkContent("我也觉得！");
//        remark.setDishId(1);
//        user = new User();
//        user.setId(1);
//        remark.setUser(user);
//        System.out.println("---->"+iRemarkService.save(remark));
//
//        remark.setRemarkContent("666");
//        remark.setDishId(2);
//        user = new User();
//        user.setId(1);
//        remark.setUser(user);
//        System.out.println("---->"+iRemarkService.save(remark));
    }
}
