package ru.parhomych.di.factorymethod;

public class RobotFactory {

    public static Robot getRobotR2D2(){
        return new Robot("R2-D2");
    }

    public Robot getFactoryBeanOfRobot() {
        return new Robot("Robot by FactoryBean");
    }
}
