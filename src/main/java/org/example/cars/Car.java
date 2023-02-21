package org.example.cars;

public class Car implements Movable{
    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }

    public void init() {
        System.out.println("Class car: init");
    }

    public void destroy() {
        System.out.println("Class car: destroy");
    }
}
