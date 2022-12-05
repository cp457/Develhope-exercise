public class Boat extends Vehicle{

    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound(){
        System.out.println("FFFooooo FFFooooo ");
    }

    public Boat(int maxSpeed, int weight){

        this.type = "Boat ";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;

    }

    public String getBoatWeightAndSpeed(){
        return("The total of the weight and the max speed is " + maxKnotsSpeed + boatKilosWeight);
    }
}
