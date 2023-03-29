package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TortoiseTest {

    @Test
    public void test1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Tortoise tortoise1 = new Tortoise();
        tortoise1.printSpeedAndGroup(0.39);

        String expected = "Average speed is: 0.39" +
                "Animal group is: MEDIUM";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
        assertEquals("crawl", tortoise1.getMoveType());
    }

    @Test
    public void test2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Tortoise tortoise1 = new Tortoise();
        tortoise1.printSpeedAndGroup(0.19);

        String expected = "Average speed is: 0.19" +
                "Animal group is: SLOW";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
        assertEquals("crawl", tortoise1.getMoveType());
    }

    @Test
    public void test3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Tortoise tortoise1 = new Tortoise();
        tortoise1.printSpeedAndGroup(0.60);

        String expected = "Average speed is: 0.6" +
                "Animal group is: MEDIUM";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
        assertEquals("crawl", tortoise1.getMoveType());
    }

    @Test
    public void test4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Tortoise tortoise1 = new Tortoise();
        tortoise1.printSpeedAndGroup(-1);

        assertTrue(out.toString().isEmpty());
    }
}
