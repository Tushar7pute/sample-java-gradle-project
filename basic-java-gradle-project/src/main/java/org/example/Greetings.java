package org.example;

import java.util.Calendar;

public class Greetings {

    public static final String MORNING = "Good Morning!";
    public static final String AFTERNOON =  "Good Afternoon!";
    public static final String EVENING =  "Good Evening!";

    public static String fetchGreetingMessage(){
        int hotd = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(hotd < 12){
            return MORNING;
        } else if(hotd < 18){
            return AFTERNOON;
        } else {
            return EVENING;
        }
    }
}
