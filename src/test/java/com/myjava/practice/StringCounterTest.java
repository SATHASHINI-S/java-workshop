package com.myjava.practice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCounterTest {

    @Test
    public void stringCounter(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String is immutable object");
        Assertions.assertEquals(4,count);
    }

    @Test

    public void stringCounterwithoutSpace(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String");
        Assertions.assertEquals(1,count);
    }

    @Test

    public void stringCounterDoubleSpace(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String  count");
        Assertions.assertEquals(2,count);
    }

    @Test

    public void stringCounterwithcomma(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String, Immutable");
        Assertions.assertEquals(2,count);
    }


    @Test
    public void stringCounterwithSpecial(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String,@#$%^ Immutable");
        Assertions.assertEquals(2,count);
    }

    @Test
    public void stringCounterwithSingleQuotes(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String,'@#$%^' Immutable");
        Assertions.assertEquals(2,count);
    }

    @Test
    public void stringCounterwithDoubleQuotes(){
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String,\"'@#$%^\" Immutable");
        Assertions.assertEquals(2,count);
    }

}
