public class TesterClass {

    public static void main(String[] args) {

        Car car = new Car(4, 4, 20.2);
        Boat boat = new Boat(20, 200);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();

        System.out.println(boat.getBoatWeightAndSpeed());
    }

}
