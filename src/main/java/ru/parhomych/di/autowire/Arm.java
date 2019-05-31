package ru.parhomych.di.autowire;

public class Arm {

    private String nameOfArm;
    private String material;

    public Arm(String nameOfArm, String material) {
        this.nameOfArm = nameOfArm;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Arm{" +
                "nameOfArm='" + nameOfArm + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
