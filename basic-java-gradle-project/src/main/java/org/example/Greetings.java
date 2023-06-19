package org.example;

import java.util.Calendar;

public class Greetings {

    public static final String MORNING = "Good Morning";
    public static final String AFTERNOON =  "Good Afternoon";
    public static final String EVENING =  "Good Evening";

    Calendar calendar ;

    public Greetings(Calendar calendar){
        this.calendar = calendar;
    }

    public String fetchGreetingMessage(){
        int hotd = calendar.get(Calendar.HOUR_OF_DAY);

        if(hotd < 12){
            return MORNING;
        } else if(hotd < 18){
            return AFTERNOON;
        } else {
            return EVENING;
        }
    }
}
