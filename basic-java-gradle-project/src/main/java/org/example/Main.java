package org.example;

import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Greetings greetings = new Greetings(Calendar.getInstance(Locale.getDefault()));
        System.out.println( greetings.fetchGreetingMessage() + " world!");
    }


}