package ru.parhomych.di.spel;

public class Student {

    private String name;
    private EducationalProgram educationalProgram;
    private int age;

    public Student(String name, EducationalProgram educationalProgram, int age) {
        System.out.println("Student.Student");
        this.name = name;
        this.educationalProgram = educationalProgram;
        this.age = age;
    }

    public String getName() {
        System.out.println("Student.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("Student.setName");
        this.name = name;
    }

    public EducationalProgram getEducationalProgram() {
        System.out.println("Student.getEducationalProgram");
        return educationalProgram;
    }

    public void setEducationalProgram(EducationalProgram educationalProgram) {
        System.out.println("Student.setEducationalProgram");
        this.educationalProgram = educationalProgram;
    }

    public int getAge() {
        System.out.println("Student.getAge");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Student.setAge");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", educationalProgram=" + educationalProgram +
                ", age=" + age +
                '}';
    }
}
