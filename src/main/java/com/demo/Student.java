package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Description:
 * @Author: yingjie.liu
 * @Date: 2020/05/23/16:59
 */

public class Student implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,
        DisposableBean {


    private String name;

    public Student() {
        System.out.println("执行无参构造函数。。。");
    }

    public void initStudent() {
        System.out.println("执行init方法。。。");
    }

    public void studentDestroy() {
        System.out.println("执行studentDestroy方法。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeanName(String s) {
        System.out.println("执行了setBeanName 。。。");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("执行了setBeanFactory。。。");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("执行了afterPropertiesSet。。。");
    }

    public void destroy() throws Exception {
        System.out.println("执行了destroy。。。");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext。。。");
    }
}
