package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lang.NonNullApi;

/**
 * @Description:
 * @Author: yingjie.liu
 * @Date: 2020/05/23/18:33
 */
public class SpringDemoTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        String name = student.getName();
        System.out.println(name);

    }
}
