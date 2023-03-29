package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HorseTest {

    @Test
    public void test1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Horse horse1 = new Horse();
        horse1.printSpeedAndGroup(39);

        String expected = "Average speed is: 39.0" +
                "Animal group is: MEDIUM";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
        assertEquals("run", horse1.getMoveType());
    }

    @Test
    public void test2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Horse horse1 = new Horse();
        horse1.printSpeedAndGroup(19);

        String expected = "Average speed is: 19.0" +
                "Animal group is: SLOW";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
        assertEquals("run", horse1.getMoveType());
    }

    @Test
    public void test3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Horse horse1 = new Horse();
        horse1.printSpeedAndGroup(60);

        String expected = "Average speed is: 60.0" +
                "Animal group is: FAST";
        assertEquals("Wrong print. Please check your code",
                expected,
                out.toString().replace("\n", "").replace("\r", "").trim());
        assertEquals("run", horse1.getMoveType());
    }

    @Test
    public void test4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Horse horse1 = new Horse();
        horse1.printSpeedAndGroup(-1);

        assertTrue(out.toString().isEmpty());
    }
}
