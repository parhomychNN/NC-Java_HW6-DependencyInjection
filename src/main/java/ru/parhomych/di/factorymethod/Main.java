package ru.parhomych.di.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config-for-factory-method.xml");
        Robot r2d2 = (Robot) context.getBean("robotR2D2");
        System.out.println(r2d2);

        Robot robotBeanFactory = (Robot) context.getBean("robotMadeByFactoryBean");
        System.out.println(robotBeanFactory);
    }
}
