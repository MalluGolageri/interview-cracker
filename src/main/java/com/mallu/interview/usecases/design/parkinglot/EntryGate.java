package com.mallu.interview.usecases.design.parkinglot;

import com.mallu.interview.usecases.design.parkinglot.Vehicle.Vehicle;

public class EntryGate {

    private ParkingLevel[] levels;
    public EntryGate(ParkingLevel[] levels){
        this.levels = levels;
    }

    public void handleVehicleEntry(Vehicle vehicle){
        for(int i = 0; i < levels.length; i++){
            if(levels[i].getParkingSpaces().isParkingSpaceAvailable()) {
                levels[i].getParkingSpaces().putCarInParkingSpace(vehicle);
                break;
            }
        }
    }
}
