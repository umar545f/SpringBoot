package ParkingLotDesign;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ParkingLot parkingLot = new ParkingLot(2,2,2);
        Vehicle truck = new Vehicle(VehicleType.TRUCK);
        parkingLot.parkVehicle(truck);
        parkingLot.unparkVehicle(truck);
    }
}
