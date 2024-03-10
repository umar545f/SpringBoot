package ParkingLotDesign;

public class Vehicle {
    private int licensePlateNo;
    private VehicleType vehicleType;
    private ParkingSpot parkingSpot;

    public  Vehicle(VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }
    public int getLicensePlateNo() {
        return licensePlateNo;
    }

    public void setLicensePlateNo(int licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
