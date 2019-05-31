package ru.parhomych.di.spel;

public class EducationalProgram {

    private String name;

    public EducationalProgram(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EducationalProgram{" +
                "name='" + name + '\'' +
                '}';
    }
}
