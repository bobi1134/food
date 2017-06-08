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
            System.out.println("------>"+university.getUniversityCName());
        }
    }

    /**
     * 插入测试 & 事务测试
     */
    @Test
    public void test2(){
        University university = new University();
        university.setUniversityCName("四川农业大学");
        university.setUniversityEName("Sichuan Agricultural University");
        university.setCnDescription("四川农业大学（Sichuan Agricultural University）简称“川农大（SAU）”，是由四川省人民政府主管的一所以生物科技为特色、农业科技为优势，农、理、工、经、管、医、文、教、法、艺多学科协调发展的重点大学，是国家“211工程”重点建设院校之一，入选“111计划“、“卓越农林人才教育培养计划”、“援疆学科建设计划”、“国家建设高水平大学公派研究生项目” ，是国家“973计划”承担高校，“四川2011计划”高校  ，全国首批高等学校新农村发展研究院试点单位，四川省首批人才优先发展试验区2所试点高校之一， 具备自主招生资格。");
        university.setEnDescription("Sichuan Agricultural University (Sichuan Agricultural University) referred to as \"Sichuan Agricultural University (SAU)\", is the Sichuan Provincial People's Government in charge of a biotechnology for the characteristics of agricultural science and technology as an advantage, agriculture, science, industry, management, Is one of the key construction schools of the national \"211 Project\", selected as \"111 Plan\", \"Excellent Agriculture and Forestry Talents Education and Training Program\", \"Yuanjiang Discipline Construction Plan\", \" \"National Construction of high-level university public school graduate project\" [1], is the national \"973 plan\" to undertake colleges and universities, \"Sichuan 2011 Plan\" colleges and universities, the first batch of colleges and universities in the new rural development research pilot units, the first batch of Sichuan Province Talent priority development pilot area 2 one of the pilot colleges and universities, with independent enrollment qualifications");
        Integer res = iUniversityService.save(university);
        System.out.println("----------->"+res);

//        User user = new User();
//        user.setUserName("admin");
//        Integer res = iUserService.save(user);
//        System.out.println("----------->"+res);
    }
}
