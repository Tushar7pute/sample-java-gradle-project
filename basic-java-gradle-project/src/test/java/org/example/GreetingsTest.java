package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class GreetingsTest {


    @Test
    void testIfFetchGreetingWorks(){

        Calendar time_10am = new Calendar.Builder().setTimeOfDay(10,0,0).build();
        Calendar time_2pm = new Calendar.Builder().setTimeOfDay(14,0,0).build();
        Calendar time_8pm = new Calendar.Builder().setTimeOfDay(20,0,0).build();


        String morn = new Greetings(time_10am).fetchGreetingMessage();
        Assertions.assertEquals(Greetings.MORNING, morn);
        Assertions.assertEquals(Greetings.AFTERNOON, new Greetings(time_2pm).fetchGreetingMessage());
        Assertions.assertEquals(Greetings.EVENING, new Greetings(time_8pm).fetchGreetingMessage());

    }

}
