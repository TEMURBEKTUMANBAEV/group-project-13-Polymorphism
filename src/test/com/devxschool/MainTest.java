package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void test1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[0]);

        String expected = "Average speed is: 50.0\n" +
                "Animal group is: SUPER FAST\n" +
                "AnimalData{name='Animal Test', moveType='swim', sound='boom'}\n" +
                "\n" +
                "Average speed is: 60.0\n" +
                "Animal group is: FAST\n" +
                "AnimalData{name='Spirit', moveType='run', sound='neigh'}\n" +
                "\n" +
                "Average speed is: 0.6\n" +
                "Animal group is: MEDIUM\n" +
                "AnimalData{name='Verne', moveType='crawl', sound='null'}";

        String message = "Wrong output, please check your code. \nExpected:\n" + expected + "\n\nActual: \n" + out.toString().trim();

        assertTrue(message, out.toString().contains("Average speed is: 50.0"));
        assertTrue(message, out.toString().contains("Animal group is: SUPER FAST"));
        assertTrue(message, out.toString().contains("AnimalData{name='Animal Test', moveType='swim', sound='boom'}"));
        assertTrue(message, out.toString().contains("Average speed is: 60.0"));
        assertTrue(message, out.toString().contains("Animal group is: FAST"));
        assertTrue(message, out.toString().contains("Horse{name='Spirit', moveType='run', sound='neigh'}"));
        assertTrue(message, out.toString().contains("Average speed is: 0.6"));
        assertTrue(message, out.toString().contains("Animal group is: MEDIUM"));
        assertTrue(message, out.toString().contains("Tortoise{name='Verne', moveType='crawl', sound='null'}"));
    }
}

