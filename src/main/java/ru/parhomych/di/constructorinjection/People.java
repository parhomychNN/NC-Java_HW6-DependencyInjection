package ru.parhomych.di.constructorinjection;

public class People {

    private Job job;
    private int age;
    private String name;

    public People(Job job, int age, String name) {
        this.age = age;
        this.job = job;
        this.name = name;
        System.out.println("People.People - конструктор People");
    }

    public int getAge() {
        System.out.println("People.getAge");
        return age;
    }

    public Job getJob() {
        System.out.println("People.getJob");
        return job;
    }

    @Override
    public String toString() {
        return "People{" +
                "job=" + job +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}
