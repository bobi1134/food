package cn.mrx.food.test.hibernate;

import cn.mrx.food.domain.*;
import cn.mrx.food.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: HibernateDataInit
 * @Author: Mr.X
 * @Date: 2017/6/12 16:04
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class HibernateDataInit {

    @Autowired private IUserService iUserService;
    @Autowired private IUniversityService iUniversityService;
    @Autowired private ICanteenService iCanteenService;
    @Autowired private IDishService iDishService;
    @Autowired private IRemarkService iRemarkService;


    @Test
    public void test(){

        /**user save()*************************************************************************************/
        User user = new User();
        user.setEmail("jxjy.ing@foxmail.com");
        user.setNickName("Mr.X");
        user.setPwd("111111");
        user.setRole(1);
        user.setEnabled(1);
        System.out.println("user save()---->"+iUserService.save(user));

        user.setEmail("1451965355@qq.com");
        user.setNickName("Old friend");
        user.setPwd("111111");
        user.setRole(2);
        user.setEnabled(1);
        System.out.println("user save()---->"+iUserService.save(user));

        user.setEmail("admin@qq.com");
        user.setNickName("Admin");
        user.setPwd("111111");
        user.setRole(2);
        user.setEnabled(1);
        System.out.println("user save()---->"+iUserService.save(user));

        user.setEmail("test1@qq.com");
        user.setNickName("测试账号1");
        user.setPwd("111111");
        user.setRole(3);
        user.setEnabled(1);
        System.out.println("user save()---->"+iUserService.save(user));

        user.setEmail("test2@qq.com");
        user.setNickName("测试账号2");
        user.setPwd("111111");
        user.setRole(3);
        user.setEnabled(-1);
        System.out.println("user save()---->"+iUserService.save(user));

        user.setEmail("test3@qq.com");
        user.setNickName("测试账号3");
        user.setPwd("111111");
        System.out.println("user save()---->"+iUserService.save(user));

        /**university save()*************************************************************************************/
        University university = new University();
        university.setUniversityCName("四川农业大学");
        university.setUniversityEName("Sichuan Agricultural University");
        university.setCnDescription("四川农业大学（Sichuan Agricultural University）简称“川农大（SAU）”，是由四川省人民政府主管的一所以生物科技为特色、农业科技为优势，农、理、工、经、管、医、文、教、法、艺多学科协调发展的重点大学，是国家“211工程”重点建设院校之一，入选“111计划“、“卓越农林人才教育培养计划”、“援疆学科建设计划”、“国家建设高水平大学公派研究生项目” ，是国家“973计划”承担高校，“四川2011计划”高校  ，全国首批高等学校新农村发展研究院试点单位，四川省首批人才优先发展试验区2所试点高校之一， 具备自主招生资格。");
        university.setEnDescription("Sichuan Agricultural University (Sichuan Agricultural University) referred to as \"Sichuan Agricultural University (SAU)\", is the Sichuan Provincial People's Government in charge of a biotechnology for the characteristics of agricultural science and technology as an advantage, agriculture, science, industry, management, Is one of the key construction schools of the national \"211 Project\", selected as \"111 Plan\", \"Excellent Agriculture and Forestry Talents Education and Training Program\", \"Yuanjiang Discipline Construction Plan\", \" \"National Construction of high-level university public school graduate project\" [1], is the national \"973 plan\" to undertake colleges and universities, \"Sichuan 2011 Plan\" colleges and universities, the first batch of colleges and universities in the new rural development research pilot units, the first batch of Sichuan Province Talent priority development pilot area 2 one of the pilot colleges and universities, with independent enrollment qualifications");
        System.out.println("university save()---->"+iUniversityService.save(university));

        university.setUniversityCName("清华大学");
        university.setUniversityEName("Tsinghua University");
        university.setCnDescription("清华大学（Tsinghua University），简称“清华”，由中华人民共和国教育部直属，中央直管副部级建制，位列“211工程”、“985工程”，入选“珠峰计划”、“2011计划”、“111计划”、“卓越工程师教育培养计划”、“卓越法律人才教育培养计划”、“卓越医生教育培养计划”，为九校联盟、东亚研究型大学协会、环太平洋大学联盟、亚洲大学联盟[1]  、清华大学—剑桥大学—麻省理工学院低碳能源大学联盟成员。");
        university.setEnDescription("Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, \",\" 111 Program \",\" Excellent Engineer Education and Training Program \",\" Excellent Legal Personnel Education and Training Program \",\" Excellence Doctor Education Program \", Nine Schools, East Asian Research University Association, Pacific Rim Union, Asian University Alliance [1], Tsinghua University - Cambridge University - Massachusetts Institute of Technology Low Carbon Energy University Alliance member.");
        System.out.println("university save()----->"+iUniversityService.save(university));

        university.setUniversityCName("北京大学");
        university.setUniversityEName("Peking University");
        university.setCnDescription("北京大学（Peking University）简称“北大”，诞生于1898年，初名京师大学堂，是中国近代第一所国立大学，也是第一个以“大学”之名创办的学校，其成立标志着中国近代高等教育的开端。北大是中国近代以来唯一以国家最高学府身份创立的学校，最初也是国家最高教育行政机关，行使教育部职能，统管全国教育。北大催生了中国最早的现代学制，开创了中国最早的文科、理科、社科、农科、医科等大学学科，是近代以来中国高等教育的奠基者。");
        university.setEnDescription("Peking University (Peking University) referred to as \"Peking University\", was born in 1898, the first name of the capital school, is the first modern Chinese university, is the first to \"university\" in the name of the school, its establishment marks the The Beginning of Modern Higher Education. Peking University is the only country in modern China since the creation of the highest institution of the school, initially the highest educational administrative organs, the exercise of the functions of the Ministry of Education, the national education. Peking University gave birth to China's earliest modern academic system, created China's earliest liberal arts, science, social science, agriculture, medical and other university disciplines, is the founder of modern Chinese higher education since modern times.");
        System.out.println("university save()----->"+iUniversityService.save(university));

        university.setUniversityCName("四川大学");
        university.setUniversityEName("Sichuan University");
        university.setCnDescription("四川大学（Sichuan University），简称“川大”，由中华人民共和国教育部直属，中央直管副部级建制，位列“211工程”、“985工程”，入选“2011计划”、“珠峰计划”、“111计划”、“卓越工程师教育培养计划”、“海外高层次人才引进计划”，设有研究生院，拥有研究生自主划线资格，是一所综合性全国重点大学。");
        university.setEnDescription("Sichuan University, Sichuan University (Sichuan University), referred to as \"Sichuan University\", by the People's Republic of China directly under the Ministry of Education, the central straight pipe vice ministerial level system, ranked \"211 project\", \"985 project\", selected \"2011 plan\" Plan \",\" 111 plan \",\" excellent engineer education and training program \",\" overseas high-level talent introduction plan \", with graduate school, with graduate students qualified crossed, is a comprehensive national key university.");
        System.out.println("university save()---->"+iUniversityService.save(university));

        university.setUniversityCName("电子科技大学");
        university.setUniversityEName("University Of Electronic Science And Technology Of China");
        university.setCnDescription("电子科技大学（University of Electronic Science and Technology of China）简称“电子科大”，坐落于有“天府之国”之称的成都市，由中华人民共和国教育部直属，为教育部 、工信部 、四川省人民政府重点共建，位列“211工程”、“985工程”，入选国家“2011计划”、“111计划”、“卓越工程师教育培养计划”，两电一邮成员，设有研究生院，是一所以电子信息科学技术为核心、以工为主，理工渗透，理、工、管、文协调发展的多科性研究型全国重点大学，被誉为“中国电子类院校的排头兵”。");
        university.setEnDescription("University of Electronic Science and Technology (University of Electronic Science and Technology of China) referred to as \"electronic science\", is located in the \"land of abundance,\" said the city of Chengdu, by the People's Republic of China directly under the Ministry of Education, Ministry of Education, Ministry of Industry, Sichuan Provincial People's Government The \"211 Project\", \"985 Project\", selected in the \"2011 Plan\", \"111 Plan\", \"Excellent Engineer Education and Training Program\", two electric and one postal member, with a graduate school, Information science and technology as the core, to the main work, science and technology penetration, management, management, management of the coordinated development of multi-disciplinary research-based national key universities, known as \"China's electronic institutions of the vanguard.\"");
        System.out.println("university save()----->"+iUniversityService.save(university));

        /**canteen save()*************************************************************************************/
        Canteen canteen = new Canteen();
        //川农
        canteen.setCanteenName("小木屋");
        canteen.setUniversityId(1);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("杏苑");
        canteen.setUniversityId(1);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("竹苑");
        canteen.setUniversityId(1);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("桂苑");
        canteen.setUniversityId(1);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        //清华
        canteen.setCanteenName("紫荆园");
        canteen.setUniversityId(2);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("桃李园");
        canteen.setUniversityId(2);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("丁香园");
        canteen.setUniversityId(2);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("听涛园");
        canteen.setUniversityId(2);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("清芬园");
        canteen.setUniversityId(2);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("闻馨园");
        canteen.setUniversityId(2);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        //北大
        canteen.setCanteenName("学一");
        canteen.setUniversityId(3);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("康博斯");
        canteen.setUniversityId(3);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("农园");
        canteen.setUniversityId(3);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("艺园");
        canteen.setUniversityId(3);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("勺园");
        canteen.setUniversityId(3);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("家园");
        canteen.setUniversityId(3);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        //川大
        canteen.setCanteenName("西园一餐厅");
        canteen.setUniversityId(4);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("西园二餐厅");
        canteen.setUniversityId(4);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("馨苑");
        canteen.setUniversityId(4);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        //电子科技大学
        canteen.setCanteenName("银桦餐厅");
        canteen.setUniversityId(5);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("紫荆餐厅");
        canteen.setUniversityId(5);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        canteen.setCanteenName("芙蓉餐厅");
        canteen.setUniversityId(5);
        System.out.println("canteen save()---->"+iCanteenService.save(canteen));

        /**dish save()*************************************************************************************/
        Dish dish = new Dish();
        //川农
        //  - 小木屋 - 特色菜
        dish.setDishName("泡椒鱼皮");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("皮蛋鸭卷");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("沙田蜜柚柚子皮");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("酸辣土豆片");
        dish.setDishType(1);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 小木屋 - 蔬菜
        dish.setDishName("飘儿白");
        dish.setDishType(2);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("莲花白");
        dish.setDishType(2);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("莴笋");
        dish.setDishType(2);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 小木屋 - 肉类
        dish.setDishName("小炒肉");
        dish.setDishType(3);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("土豆丝炒肉");
        dish.setDishType(3);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("土豆回锅");
        dish.setDishType(3);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));


        //  - 小木屋 - 小吃类
        dish.setDishName("川味香肠");
        dish.setDishType(4);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        dish.setDishName("李庄白肉");
        dish.setDishType(4);
        dish.setCanteenId(1);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 杏苑 - 特色菜
        dish.setDishName("番茄橘子烧排骨");
        dish.setDishType(1);
        dish.setCanteenId(2);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 竹苑 - 特色菜
        dish.setDishName("糖醋排骨");
        dish.setDishType(1);
        dish.setCanteenId(3);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 桂苑 - 特色菜
        dish.setDishName("辣子鸡丁");
        dish.setDishType(1);
        dish.setCanteenId(4);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //清华
        //  - 紫荆园 - 特色菜
        dish.setDishName("一层香锅");
        dish.setDishType(1);
        dish.setCanteenId(5);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 桃李园 - 特色菜
        dish.setDishName("二层自选各种粥");
        dish.setDishType(1);
        dish.setCanteenId(6);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 丁香园 - 特色菜
        dish.setDishName("老碗鱼/排骨/鸡块");
        dish.setDishType(1);
        dish.setCanteenId(7);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 听涛园 - 特色菜
        dish.setDishName("一层肉夹馍+油泼面");
        dish.setDishType(1);
        dish.setCanteenId(8);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 清芬园 - 特色菜
        dish.setDishName("地下清青快餐");
        dish.setDishType(1);
        dish.setCanteenId(9);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 闻馨园 - 特色菜
        dish.setDishName("清真素面");
        dish.setDishType(1);
        dish.setCanteenId(10);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //北大
        //  - 学一 - 特色菜
        dish.setDishName("青菜鸡蛋汤");
        dish.setDishType(1);
        dish.setCanteenId(11);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 康博斯 - 特色菜
        dish.setDishName("水饺/蒸饺");
        dish.setDishType(1);
        dish.setCanteenId(12);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 农园 - 特色菜
        dish.setDishName("麻辣烫");
        dish.setDishType(1);
        dish.setCanteenId(13);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 艺园 - 特色菜
        dish.setDishName("泡椒牛肉");
        dish.setDishType(1);
        dish.setCanteenId(14);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 勺园 - 特色菜
        dish.setDishName("手抓面");
        dish.setDishType(1);
        dish.setCanteenId(15);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 家园 - 特色菜
        dish.setDishName("河南大饼");
        dish.setDishType(1);
        dish.setCanteenId(16);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //川大
        //  - 西园一餐厅 - 特色菜
        dish.setDishName("西园一餐厅");
        dish.setDishType(1);
        dish.setCanteenId(17);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 西园二餐厅 - 特色菜
        dish.setDishName("盖浇饭");
        dish.setDishType(1);
        dish.setCanteenId(18);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 馨苑 - 特色菜
        dish.setDishName("砂锅");
        dish.setDishType(1);
        dish.setCanteenId(19);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //电子科技大学
        //  - 银桦餐厅 - 特色菜
        dish.setDishName("干锅排骨");
        dish.setDishType(1);
        dish.setCanteenId(20);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 紫荆餐厅 - 特色菜
        dish.setDishName("莲藕");
        dish.setDishType(1);
        dish.setCanteenId(21);
        System.out.println("dish save()---->"+iDishService.save(dish));

        //  - 芙蓉餐厅 - 特色菜
        dish.setDishName("血旺");
        dish.setDishType(1);
        dish.setCanteenId(22);
        System.out.println("dish save()---->"+iDishService.save(dish));

        /**remark save()*************************************************************************************/
        Remark remark = new Remark();
        // 川农-小木屋-特色菜(泡椒鱼皮)
        remark.setRemarkContent("非常好吃哟！");
        remark.setDishId(1);
        remark.setUserId(1);
        System.out.println("remark save()---->"+iRemarkService.save(remark));

        // 川农-小木屋-特色菜(泡椒鱼皮)
        remark.setRemarkContent("我是22舍的，我也觉得非常好吃哟！");
        remark.setDishId(1);
        remark.setUserId(2);
        System.out.println("remark save()---->"+iRemarkService.save(remark));

        // 川农-小木屋-特色菜(泡椒鱼皮)
        remark.setRemarkContent("赞赞赞赞赞赞！");
        remark.setDishId(1);
        remark.setUserId(3);
        System.out.println("remark save()---->"+iRemarkService.save(remark));

        // 川农-小木屋-蔬菜(飘儿白)
        remark.setRemarkContent("赞赞赞赞赞赞，很新鲜的蔬菜！");
        remark.setDishId(5);
        remark.setUserId(3);
        System.out.println("remark save()---->"+iRemarkService.save(remark));

        // 川农-杏苑-特色菜(番茄橘子烧排骨)
        remark.setRemarkContent("666666！");
        remark.setDishId(13);
        remark.setUserId(2);
        System.out.println("remark save()---->"+iRemarkService.save(remark));
    }
}
