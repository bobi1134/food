package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.Canteen;
import cn.mrx.food.service.ICanteenService;
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

    /**
     * 插入食堂
     */
    @Test
    public void test1(){
        Canteen canteen = new Canteen();
        canteen.setCanteenName("小木屋");
        canteen.setUniversityId(1);
        System.out.println("---->"+iCanteenService.save(canteen));
        canteen.setCanteenName("杏苑");
        canteen.setUniversityId(1);
        System.out.println("---->"+iCanteenService.save(canteen));
        canteen.setCanteenName("竹苑");
        canteen.setUniversityId(1);
        System.out.println("---->"+iCanteenService.save(canteen));
        canteen.setCanteenName("桂苑");
        canteen.setUniversityId(1);
        System.out.println("---->"+iCanteenService.save(canteen));
        canteen.setCanteenName("西园一餐厅");
        canteen.setUniversityId(2);
        System.out.println("---->"+iCanteenService.save(canteen));
        canteen.setCanteenName("西园二餐厅");
        canteen.setUniversityId(2);
        System.out.println("---->"+iCanteenService.save(canteen));
        canteen.setCanteenName("馨苑");
        canteen.setUniversityId(2);
        System.out.println("---->"+iCanteenService.save(canteen));
    }
}
