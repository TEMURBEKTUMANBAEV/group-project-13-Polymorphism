package com.devxschool;

// TODO SETUP THE CLASS
public class Horse extends AnimalData{
    {
        this.setMoveType("run");
    }
    public void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed >= 0) {
            System.out.println("Average speed is: " + avgSpeed);
            if (avgSpeed > 60) {
                System.out.println("Animal group is: SUPER FAST");
            } else if (avgSpeed > 40 && avgSpeed <= 60) {
                System.out.println("Animal group is: FAST");
            } else if (avgSpeed > 20 && avgSpeed <= 40) {
                System.out.println("Animal group is: MEDIUM");
            } else {
                System.out.println("Animal group is: SLOW");
            }
        }
    }
}
