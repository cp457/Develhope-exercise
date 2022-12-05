public class Car extends Vehicle {

    int numberOfDoor;
    double carPrice;

    @Override
    public void showVehicleDetails() {

        System.out.println("This vehicle is " + type + " and it have " + numberOfWheels + " wheels");
        super.showVehicleDetails();
        System.out.println("This car have " + numberOfDoor + " doors ");

    }
    @Override
    public void doVehicleSound(){
        System.out.println("Beeep beeep ");
    }

    public  Car (int wheels, int door, double price){

        this.type = "Car ";
        this.numberOfDoor = door;
        this.numberOfWheels = wheels;
        this.carPrice = price;
    }
}

