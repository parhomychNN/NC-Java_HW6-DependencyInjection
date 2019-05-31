package ru.parhomych.di.spel;

public class SimpleConfig {

    private String name = "Ilya";
    private EducationalProgram educationalProgram = new EducationalProgram("Computer Sience") ;
    private int age = 26;

    public String getName() {
        System.out.println("SimpleConfig.getName");
        return name;
    }

    public EducationalProgram getEducationalProgram() {
        System.out.println("SimpleConfig.getEducationalProgram");
        return educationalProgram;
    }

    public int getAge() {
        System.out.println("SimpleConfig.getAge");
        return age;
    }


}
