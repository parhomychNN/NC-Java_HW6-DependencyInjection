package ru.parhomych.di.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app-config-for-autowire.xml");

        Robot robot1 = (Robot)context.getBean("robot1"); // autowire через конструктор
        Robot robot2 = (Robot)context.getBean("robot2"); // autowire через тип
        Robot robot3 = (Robot)context.getBean("robot3"); // autowire через имя
        System.out.println("autowire через конструктор\n" + robot1);
        System.out.println("autowire через тип\n" + robot2);
        System.out.println("autowire через имя\n" + robot3);
    }
}
