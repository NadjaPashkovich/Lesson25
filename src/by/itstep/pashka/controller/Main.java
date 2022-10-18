package by.itstep.pashka.controller;

import by.itstep.pashka.model.entity.Bus;
import by.itstep.pashka.model.entity.Car;
import by.itstep.pashka.model.entity.abstracts.Transport;
import by.itstep.pashka.model.entity.Truck;
import by.itstep.pashka.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {new Car(50), new Car(40), new Bus(110),
                new Bus(200),new Bus(300),new Truck(500)};
        int total = GasStation.calcTotalOil(transports);
        System.out.println("Total is: "+total);
    }
}
