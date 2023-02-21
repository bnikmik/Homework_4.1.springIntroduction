package org.example;

import org.example.cars.Movable;
import org.example.persons.AbleToDrive;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Movable movable = context1.getBean("customCar", Movable.class);
        movable.go();
        context1.close();

        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContextDIConstructor.xml");

        AbleToDrive person1 = context2.getBean("customPerson", AbleToDrive.class);
        person1.goByCar();
        context2.close();

        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContextDISetter.xml");

        AbleToDrive person2 = context3.getBean("customPerson", AbleToDrive.class);

        person2.goByCar();
        context3.close();
    }
}




