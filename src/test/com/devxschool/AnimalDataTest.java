package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalDataTest {

    @Test
    public void test1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        AnimalData animalData1 = new AnimalData();
        animalData1.printSpeedAndGroup(21);

        String expected = "Average speed is: 21.0" +
                "Animal group is: FAST";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
    }

    @Test
    public void test2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        AnimalData animalData1 = new AnimalData();
        animalData1.printSpeedAndGroup(31);

        String expected = "Average speed is: 31.0" +
                "Animal group is: SUPER FAST";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
    }

    @Test
    public void test3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        AnimalData animalData1 = new AnimalData();
        animalData1.printSpeedAndGroup(10);

        String expected = "Average speed is: 10.0" +
                "Animal group is: SLOW";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
    }

    @Test
    public void test4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        AnimalData animalData1 = new AnimalData();
        animalData1.printSpeedAndGroup(-1);

        assertTrue(out.toString().isEmpty());
    }
}
