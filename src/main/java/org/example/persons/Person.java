package org.example.persons;

import org.example.cars.Movable;

public class Person implements AbleToDrive {
    private Movable movable;

    public Person() {
    }

    public Person(Movable movable) {
        this.movable = movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void goByCar() {
        System.out.println("Владелец сел в автомобиль");
        movable.go();
    }
}

