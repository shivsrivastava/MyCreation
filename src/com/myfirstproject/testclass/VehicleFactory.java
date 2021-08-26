package com.myfirstproject.testclass;

public class VehicleFactory {
    String type;
    Vehicle vehicle;
    public Vehicle getVehicle(String type){
        if(type.equals("Car")){
            vehicle= new Bike(2);
        }
        else{
            vehicle= new Car(4);
        }
        return vehicle;
    }
}
