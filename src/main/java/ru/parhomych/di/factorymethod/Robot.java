package ru.parhomych.di.factorymethod;

public class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
