package org.example.cars;

public class Car implements Movable{
    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }
}
