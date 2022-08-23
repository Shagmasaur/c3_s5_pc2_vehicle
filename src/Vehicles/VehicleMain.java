package Vehicles;

public class VehicleMain
{
    public static void main(String[] args) {
        Bike bike1 = new Bike("BMW","s1000RR","Sports Bike");
        System.out.println("Bike Type is "+bike1.getVehicleType()+" & its speed is "+bike1.maxSpeed("SportsBike"));
        System.out.println(bike1.getManufacturerInformation());
        System.out.println();
        Car car1 = new Car("NISSAN","SKYLINE GTR","Sedan");
        System.out.println("Car Type is "+car1.getVehicleType()+" & its speed is "+car1.maxSpeed("sedan"));
        System.out.println(car1.getManufacturerInformation());
    }
}

