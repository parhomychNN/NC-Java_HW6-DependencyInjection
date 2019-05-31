package ru.parhomych.di.parentbeaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("**************Использование атрибута parent (наследование бинов)****************");
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config-parent-bean-inheritance.xml");

        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);
        System.out.println("Как видно, самым первым вызвался сеттер поля из родительского бина");
    }
}
