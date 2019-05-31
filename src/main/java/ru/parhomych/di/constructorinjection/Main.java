package ru.parhomych.di.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("*********** Constructor injection ************");
        System.out.println("People - главный класс (человек), Job - описание работы этого человека (объектный тип)," +
                " age - возраст человека (примитивный тип), learning group (содержит List ) (именно эти поля будем инжектить)");

        ApplicationContext context  = new ClassPathXmlApplicationContext("app-config-for-constructor-injection.xml");

        People people = (People) context.getBean("peopleBean", People.class);



        System.out.println(people.getJob().whatJob() + " <= получаем доступ к работе человека (ссылочный тип)");
        System.out.println(people.getAge() + " <= возраст нашего человека (примитивный тип)");


        LearningGroup learningGroup = (LearningGroup) context.getBean("learningGroup01");
        LearningGroup learningGroup2 = (LearningGroup) context.getBean("learningGroup02");
        System.out.println(learningGroup);
        System.out.println(learningGroup2);
    }
}
