package com.devxschool;

public class Main {

    public static void main(String[] args) {
        /**
         * There is a parent class - AnimalData, that should hold
         *  - 'name' String instance variable
         *      * default getter
         *      * setter that accepts only values longer than 2
         *  - 'moveType' String instance variable
         *      * default getter
         *      * setter is assigned only if it is either: fly, swim, run, crawl, and jump
         *  - 'sound' String instance variable
         *      * default getter
         *      * setter that accepts only values longer than 1
         *  - 'printSpeedAndGroup' method that accepts double avgSpeed as parameter.
         *       * print speed if it's not invalid (less than 0). Ex: Average speed is: 13.6
         *       * Print group depending on speed (SUPER FAST if more than 30, FAST if more than 20,
         *         MEDIUM if more than 10, and SLOW if less than or equal to 10). Ex: Animal group is: MEDIUM
         *  - 'toString' method in the format: className{name='Name', moveType='MoveType', sound='sound'}
         *
         * Now configure the Horse class:
         *  - 'printSpeedAndGroup': print SUPER FAST if more than 60, FAST if more than 40, MEDIUM if more than 20, and SLOW if less or equal to 20.
         *     After, assign moveType to run
         *
         * And there is a Tortoise class:
         *  - 'printSpeedAndGroup': print SUPER FAST if more than 1, FAST if more than 0.6, MEDIUM if more than 0.3, and SLOW if less or equal to 0.3.
         *     After, assign moveType to crawl
         *
         *
         *
         *
         * =============================================================================================================
         * TEST IN MAIN CLASS AND ANALYZE IN A GROUP
         * - create object animalData and assign values:
         *      * set name Animal Test
         *      * set moveType swim
         *      * set sound boom
         *      * call printSpeedAndGroup with parameter 50
         *      * print AnimalData object with toString + new line
         * - create object horse and assign values:
         *      * set name Spirit
         *      * set sound neigh
         *      * call printSpeedAndGroup with parameter 60
         *      * print Horse object with toString + new line
         * - create object tortoise and assign values:
         *      * set name Verne
         *      * call printSpeedAndGroup with parameter 0.6
         *      * print Horse object with toString + new line
         * - Now run all tests in 'test' folder. Fix bugs with group
         */

        // TODO WRITE CODE HERE
            // create AnimalData object
            AnimalData animalData = new AnimalData();
            animalData.setName("Animal Test");
            animalData.setMoveType("swim");
            animalData.setSound("boom");
            animalData.printSpeedAndGroup(50);
            System.out.println(animalData.toString() + "\n");
            System.out.println();

            // create Horse object
            Horse horse = new Horse();
            horse.setName("Spirit");
            horse.setSound("neigh");
            horse.printSpeedAndGroup(60);
            System.out.println(horse.toString() +    "\n");
            System.out.println();

            // create Tortoise object
            Tortoise tortoise = new Tortoise();
            tortoise.setName("Verne");
            tortoise.printSpeedAndGroup(0.6);
            System.out.println(tortoise.toString() + "\n");
            System.out.println();

            // run tests in 'test' folder
            // fix bugs with group
        }


    }

