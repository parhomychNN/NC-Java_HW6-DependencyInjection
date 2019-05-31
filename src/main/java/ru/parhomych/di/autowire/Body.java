package ru.parhomych.di.autowire;

public class Body {

    private String nameOfBody;
    private String material;

    public Body(String nameOfBody, String material) {
        this.nameOfBody = nameOfBody;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Body{" +
                "nameOfBody='" + nameOfBody + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
