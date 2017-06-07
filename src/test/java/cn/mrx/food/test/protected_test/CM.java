package cn.mrx.food.test.protected_test;

import cn.mrx.food.test.protected_test.package_a.Person;

/**
 * @ClassName: XC
 * @Author: Mr.X
 * @Date: 2017/6/7 22:52
 * @Description:
 * @Version 1.0
 */
public class CM {

    public static void main(String[] args) {
        Person person = new Person();
        //System.out.println(person.name);//编译失败
    }
}
