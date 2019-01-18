package com.example.android.javajokes;

import java.util.Random;

public class javaJokesClass {
    private static String joke[] = {
            "When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.",
            "Can a kangaroo jump higher than a house?Of course, a house doesn’t jump at all" ,

            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.Patient: \"What do you mean, 10? 10 what? Months? Weeks?Doctor: \"Nine.\"",
            " Anton, do you think I’m a bad mother?  My name is Paul"

    };

    public javaJokesClass() {

    }

    public String getRandomJoke() {
        Random rm = new Random();
        return joke[rm.nextInt(joke.length)];
    }
}