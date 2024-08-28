import java.util.ArrayList;
// Tester class for CarnivalRide hierarchy


public class CarnivalRideTester {
    public static void main(String[] args) {
        System.out.println(" Welcome to the Carnival Ride tester!");
        System.out.println("______________________________________________________________________________________________");
        System.out.println(" This program will instaniate objects of the Carnival Ride hierarchy and test their methods.");
        System.out.println("______________________________________________________________________________________________");
        // Create Rollercoaster objects
        Rollercoaster rollerRide1 = new Rollercoaster(300000, 3);
        Rollercoaster rollerRide2 = new Rollercoaster(420000, "Rocky Roller", 5);

        // Create WaterRide objects
        WaterRide waterRide1 = new WaterRide(200000, 18);
        WaterRide waterRide2 = new WaterRide(290000, "River Nile", 35);

        // Print each object using toString
        System.out.println(rollerRide1.toString());
        System.out.println(rollerRide2.toString());
        System.out.println(waterRide1.toString());
        System.out.println(waterRide2.toString());

        // Test getter methods on River Nile
        System.out.println("Ride Type = " + waterRide2.getType());
        System.out.println("River name = " + waterRide2.getName());
        System.out.println("Ride duration = " + waterRide2.getDuration());
        System.out.println("Ride water drop = "+waterRide2.getWaterdrop());

        // Use setters to change attributes
        waterRide2.setWaterdrop(95);
        rollerRide1.setName("King Kong");
        System.out.println();

        // Print updated objects using getters
        System.out.println("Modified objects:");
        System.out.println("Ride water drop = " + waterRide2.getWaterdrop());
        System.out.println("Ride name  = " + rollerRide1.getName());
        System.out.println();

        // Create ArrayList and add objects
        ArrayList<CarnivalRide> rideArray = new ArrayList<>();
        rideArray.add(rollerRide1);
        rideArray.add(rollerRide2);
        rideArray.add(waterRide1);
        rideArray.add(waterRide2);

        // Print aboutRide for each object in ArrayList
        for (CarnivalRide ride : rideArray) {
            System.out.println(ride.aboutRide());
        }
    }
}