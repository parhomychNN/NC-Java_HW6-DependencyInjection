package ru.parhomych.di.parentbeaninheritance;

public class Animal {

    private String description;

    public String getDescription() {
        System.out.println("Animal.getDescription");
        return description;
    }
    public void setDescription(String description) {
        System.out.println("Animal.setDescription");
        this.description = description;
    }
    @Override
    public String toString() {
        return "Животное с описанием: " + description;
    }


}
