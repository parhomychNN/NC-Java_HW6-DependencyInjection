package ru.parhomych.di.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("*********** Setter injection ************");
        System.out.println("People - главный класс (человек), Job - описание работы этого человека (объектный тип), age - возраст человека (примитивный тип) (именно эти поля будем инжектить)");

        ApplicationContext context  = new ClassPathXmlApplicationContext("app-config-for-setter-injection.xml");

        People people = context.getBean("peopleSetterInj01", People.class);

        System.out.println(people.getJob().whatJob() + " <= получаем доступ к работе человека (ссылочный тип)");
        System.out.println(people.getAge() + " <= возраст нашего человека (примитивный тип)");

        LearningGroup learningGroup01 = (LearningGroup) context.getBean("learningGroup01");
        LearningGroup learningGroup02 = (LearningGroup) context.getBean("learningGroup02");

        System.out.println(learningGroup01);
        System.out.println(learningGroup02);

    }
}
