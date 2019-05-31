package ru.parhomych.di.setterinjection;

public class People {

    private Job job;
    private int age;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        System.out.println("People.getAge");
        return age;
    }

    public Job getJob() {
        System.out.println("People.getJob");
        return job;
    }

    public void setJob(Job job) {
        System.out.println("People.setJob");
        this.job = job;
    }

    public void setAge(int age) {
        System.out.println("People.setAge");
        this.age = age;
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
