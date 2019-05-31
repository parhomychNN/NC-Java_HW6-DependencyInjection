package ru.parhomych.di.parentbeaninheritance;

public class Cat {

    private String color;
    private Boolean isFluffy; // пушистый ли?
    private String description;

    public String getDescription() {
        System.out.println("Cat.getDescription");
        return description;
    }
    public void setDescription(String description) {
        System.out.println("Cat.setDescription");
        this.description = description;
    }

    public String getColor() {
        System.out.println("Cat.getColor");
        return color;
    }

    public void setColor(String color) {
        System.out.println("Cat.setColor");
        this.color = color;
    }

    public Boolean getIsFluffy() {
        System.out.println("Cat.getIsFluffy");
        return isFluffy;
    }

    public void setIsFluffy(Boolean fluffy) {
        System.out.println("Cat.setIsFluffy");
        isFluffy = fluffy;
    }

    public void sayMeow(){
        System.out.println("Meow-meow-meow!!! I am a cat!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", isFluffy=" + isFluffy +
                ", description='" + description + '\'' +
                '}';
    }
}
