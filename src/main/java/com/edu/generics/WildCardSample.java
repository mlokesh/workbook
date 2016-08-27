package com.edu.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardSample {

    List<Vehicle> listVehicle = new ArrayList<Vehicle>();
    List<Car> listCar = new ArrayList<Car>();

    List<?> list1 = new ArrayList<Vehicle>();
    List<? extends Vehicle> list2 = new ArrayList<Vehicle>();
    List<? super Vehicle> list3 = new ArrayList<Vehicle>();

    private void check() {
        listVehicle.add(new Car());
        listVehicle.add(new Vehicle());

        list3.add(new Car());
        list3.add(new MotorCycle());
        list3.add(new Vehicle());
    }

}
