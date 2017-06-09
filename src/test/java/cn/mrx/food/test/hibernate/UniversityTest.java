package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.University;
import cn.mrx.food.service.IUniversityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: UniversityTest
 * @Author: Mr.X
 * @Date: 2017/6/9 15:29
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class UniversityTest {

    @Autowired
    private IUniversityService iUniversityService;

    /**
     * 大学测试
     */
    @Test
    public void test1(){
        University university = new University();
        university.setUniversityCName("四川农业大学");
        university.setUniversityEName("Sichuan Agricultural University");
        university.setCnDescription("四川农业大学（Sichuan Agricultural University）简称“川农大（SAU）”，是由四川省人民政府主管的一所以生物科技为特色、农业科技为优势，农、理、工、经、管、医、文、教、法、艺多学科协调发展的重点大学，是国家“211工程”重点建设院校之一，入选“111计划“、“卓越农林人才教育培养计划”、“援疆学科建设计划”、“国家建设高水平大学公派研究生项目” ，是国家“973计划”承担高校，“四川2011计划”高校  ，全国首批高等学校新农村发展研究院试点单位，四川省首批人才优先发展试验区2所试点高校之一， 具备自主招生资格。");
        university.setEnDescription("Sichuan Agricultural University (Sichuan Agricultural University) referred to as \"Sichuan Agricultural University (SAU)\", is the Sichuan Provincial People's Government in charge of a biotechnology for the characteristics of agricultural science and technology as an advantage, agriculture, science, industry, management, Is one of the key construction schools of the national \"211 Project\", selected as \"111 Plan\", \"Excellent Agriculture and Forestry Talents Education and Training Program\", \"Yuanjiang Discipline Construction Plan\", \" \"National Construction of high-level university public school graduate project\" [1], is the national \"973 plan\" to undertake colleges and universities, \"Sichuan 2011 Plan\" colleges and universities, the first batch of colleges and universities in the new rural development research pilot units, the first batch of Sichuan Province Talent priority development pilot area 2 one of the pilot colleges and universities, with independent enrollment qualifications");
        System.out.println("----------->"+iUniversityService.save(university));

        university.setUniversityCName("四川大学");
        university.setUniversityEName("Sichuan University");
        university.setCnDescription("四川大学（Sichuan University），简称“川大”，由中华人民共和国教育部直属，中央直管副部级建制，位列“211工程”、“985工程”，入选“2011计划”、“珠峰计划”、“111计划”、“卓越工程师教育培养计划”、“海外高层次人才引进计划”，设有研究生院，拥有研究生自主划线资格，是一所综合性全国重点大学。");
        university.setEnDescription("Sichuan University, Sichuan University (Sichuan University), referred to as \"Sichuan University\", by the People's Republic of China directly under the Ministry of Education, the central straight pipe vice ministerial level system, ranked \"211 project\", \"985 project\", selected \"2011 plan\" Plan \",\" 111 plan \",\" excellent engineer education and training program \",\" overseas high-level talent introduction plan \", with graduate school, with graduate students qualified crossed, is a comprehensive national key university.");
        System.out.println("----------->"+iUniversityService.save(university));

        university.setUniversityCName("清华大学");
        university.setUniversityEName("Tsinghua University");
        university.setCnDescription("清华大学（Tsinghua University），简称“清华”，由中华人民共和国教育部直属，中央直管副部级建制，位列“211工程”、“985工程”，入选“珠峰计划”、“2011计划”、“111计划”、“卓越工程师教育培养计划”、“卓越法律人才教育培养计划”、“卓越医生教育培养计划”，为九校联盟、东亚研究型大学协会、环太平洋大学联盟、亚洲大学联盟[1]  、清华大学—剑桥大学—麻省理工学院低碳能源大学联盟成员。");
        university.setEnDescription("Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, \",\" 111 Program \",\" Excellent Engineer Education and Training Program \",\" Excellent Legal Personnel Education and Training Program \",\" Excellence Doctor Education Program \", Nine Schools, East Asian Research University Association, Pacific Rim Union, Asian University Alliance [1], Tsinghua University - Cambridge University - Massachusetts Institute of Technology Low Carbon Energy University Alliance member.");
        System.out.println("----------->"+iUniversityService.save(university));
    }

    @Test
    public void test2(){
        List<University> universities = iUniversityService.selectLimit(2);
        for (University university : universities){
            System.out.println("---->"+university);
        }
    }

    @Test
    public void test3(){
        University university = iUniversityService.get(1);
        System.out.println("---->"+university.getUniversityCName()+","+university.getUniversityEName());
    }
}
