package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.Remark;
import cn.mrx.food.domain.User;
import cn.mrx.food.service.IDishService;
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

    @Test
    public void test1(){
    }
}
