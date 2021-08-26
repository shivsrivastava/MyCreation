package com.myfirstproject.testclass;

public class VehicleMain {
    public static void main(String args[]){
    VehicleFactory vehicleFactory = new VehicleFactory();
Vehicle vehicle = vehicleFactory.getVehicle("V");
    }
}
