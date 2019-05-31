package ru.parhomych.di.autowire;

public class Robot {

    private Head head;
    private Body body;
    private Arm arm;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Arm getArm() {
        return arm;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public Robot(Head head, Body body, Arm arm) {
        this.head = head;
        this.body = body;
        this.arm = arm;
    }

    public Robot() {
    }

    @Override
    public String toString() {
        return "*******************************\n" +
                "Robot{\n" +
                "head=" + head + "\n"+
                ", body=" + body + "\n"+
                ", arm=" + arm + "\n"+
                "}\n" +
                "******************************\n";
    }
}
