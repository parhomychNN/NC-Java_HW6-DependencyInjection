package ru.parhomych.di.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app-config-for-spel.xml");

        System.out.println("************ Создаём студента 'Илья' и подтягиваем его данные через SpEL в классе SimpleConfig *************");
        Student ilya = (Student) context.getBean("Ilya");
        System.out.println(ilya);
    }
}
