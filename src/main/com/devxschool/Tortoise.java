package com.devxschool;

// TODO SETUP THE CLASS
public class Tortoise extends AnimalData{

    {
        this.setMoveType("crawl");
    }

    @Override
    public void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed >= 0) {
            System.out.println("Average speed is: " + avgSpeed);
            if (avgSpeed > 1) {
                System.out.println("Animal group is: SUPER FAST");
            } else if (avgSpeed > 0.6 && avgSpeed <= 1) {
                System.out.println("Animal group is: FAST");
            } else if (avgSpeed > 0.3 && avgSpeed <= 0.6) {
                System.out.println("Animal group is: MEDIUM");
            } else if (avgSpeed <= 0.3){
                System.out.println("Animal group is: SLOW");
            }
        }
    }


}
