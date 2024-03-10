package ParkingLotDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
     List<CompactSpot> compactSpotList = new ArrayList<>();
     List<LargeSpot> largeSpotList = new ArrayList<>();
     List<BikeSpot> bikeSpotList = new ArrayList<>();

     int freeCompactSpots;
     int freeLargeSpots;
     int freeBikeSpots;

    public ParkingLot(int freeCompactSpots,int freeLargeSpots,int freeBikeSpots)
    {
        this.freeBikeSpots = freeBikeSpots;
        this.freeCompactSpots = freeCompactSpots;
        this.freeLargeSpots = freeLargeSpots;
    }

    public void parkVehicle(Vehicle vehicle) {
        if(vehicle.getVehicleType().equals(VehicleType.TRUCK))
        {
            if(freeLargeSpots > 0)
            {
                parkLargeVehicle(vehicle);
            }
            else
            {
                System.out.println
                        ("Sorry there are no spots available for large vehicles");
            }
        }
        else if(vehicle.getVehicleType().equals(VehicleType.CAR))
        {
            if(freeCompactSpots > 0)
            {
                parkeCompactVehicles(vehicle);
            }
            else if(freeLargeSpots > 0)
            {
                parkLargeVehicle(vehicle);
            }
            else {
                System.out.println
                        ("Sorry there are no large or compact spots available");
            }
        }
        else if(vehicle.getVehicleType().equals(VehicleType.BIKE))
        {
            if(freeBikeSpots > 0)
            {
                parkBike(vehicle);
            }
            else if(freeCompactSpots > 0)
            {
                parkeCompactVehicles(vehicle);
            }
            else if(freeLargeSpots > 0)
            {
                parkLargeVehicle(vehicle);
            }
            else {
                System.out.println
                        ("Sorry there are no large,compact or bike spots available");
            }
        }
    }

    public void unparkVehicle(Vehicle vehicle)
    {
        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        parkingSpot.setFree(true);

        if(vehicle.getVehicleType().equals(VehicleType.TRUCK))
        {
            if(largeSpotList.remove(parkingSpot))
            {
                System.out.println("We have unparked your "
                        +vehicle.getVehicleType());
                freeLargeSpots++;
            }
            else
            {
                System.out.println
                        ("You dont have "+vehicle.getVehicleType()+" in this spot");
            }

        }
       else if(vehicle.getVehicleType().equals(VehicleType.CAR))
        {
            if(compactSpotList.remove(vehicle))
            {
                System.out.println("We have unparked your "
                        +vehicle.getVehicleType());
                freeCompactSpots++;
            }
            else
            {
                System.out.println
                        ("You dont have "+vehicle.getVehicleType()+" in this spot");
            }
        }

        else if(vehicle.getVehicleType().equals(VehicleType.BIKE))
        {
            if(bikeSpotList.remove(vehicle))
            {
                System.out.println("We have unparked your "
                        +vehicle.getVehicleType());
                freeBikeSpots++;
            }
            else
            {
                System.out.println
                        ("You dont have "+vehicle.getVehicleType()+" in this spot");
            }
        }
    }

    private void parkBike(Vehicle vehicle) {
        BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setFree(false);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);

        bikeSpotList.add(bikeSpot);
        System.out.println("We have parked your "+vehicle.getVehicleType());
        freeBikeSpots--;
    }

    private void parkeCompactVehicles(Vehicle vehicle) {
        CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
        compactSpot.setFree(false);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);

        compactSpotList.add(compactSpot);

        System.out.println("We have parked your "+vehicle.getVehicleType());
        freeCompactSpots--;
    }

    private void parkLargeVehicle(Vehicle vehicle) {
        LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
        largeSpot.setFree(false);
        largeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpot);

        largeSpotList.add(largeSpot);

        System.out.println("We have parked your "+vehicle.getVehicleType());
        freeLargeSpots--;
    }
}
