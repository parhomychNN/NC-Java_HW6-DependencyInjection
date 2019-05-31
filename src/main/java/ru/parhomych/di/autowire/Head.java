package ru.parhomych.di.autowire;

public class Head {

    private String nameOfHead;
    private String material;

    public Head(String nameOfHead, String material) {
        this.nameOfHead = nameOfHead;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Head{" +
                "nameOfHead='" + nameOfHead + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
