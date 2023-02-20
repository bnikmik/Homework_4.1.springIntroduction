package org.example;

import org.example.cars.Movable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Movable movable = context.getBean("customCar", Movable.class);
        movable.go();
        context.close();
    }
}

