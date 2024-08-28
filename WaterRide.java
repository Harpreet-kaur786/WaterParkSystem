public class WaterRide extends CarnivalRide {
    private double waterdrop;

    public WaterRide(long duration, double waterdrop) {
        super("Water Ride", duration);
        this.waterdrop = waterdrop;
    }

    public WaterRide(long duration, String name, double waterdrop) {
        super("Water Ride", duration, name);
        this.waterdrop = waterdrop;
    }

    public double getWaterdrop() {
        double gettingwater= waterdrop;
        return gettingwater;
    }

    public void setWaterdrop(double waterdrop) {
        this.waterdrop = waterdrop;
    }

     // Implement fearFactor method
     @Override
     public String fearFactor() {
         String durationDescription;
         int minutes = minutes();
         if (minutes >= 7) {
             durationDescription = "long and engaging";
         } else if (minutes >= 5) {
             durationDescription = "fun and respectable";
         } else {
             durationDescription = "very short";
         }
         String waterdropDescription;
        if (waterdrop >= 40) {
            waterdropDescription = "suitable for fearless adults";
        } else if (waterdrop >= 20) {
            waterdropDescription = "suitable for most adults";
        } else {
            waterdropDescription = "safe for children";
        }
        String factor = "\nIt is both " + durationDescription + " and is " + waterdropDescription + ".\n";
        return factor;
    }

    // Implement aboutRide method
    @Override
    public String aboutRide() {
        String Ride= "This carnival ride is a " + getType() + ", and its name is " + getName() + ". " +
               fearFactor() + "This ride lasts " + minutes() + " minutes and has a water drop of " + waterdrop + " meters.";
               System.out.println();
        return Ride;
    }

   // Override toString to include waterdrop
   @Override
   public String toString() {
       return super.toString() +"\n"+ "Water Drop= \t" + waterdrop + "\n";
   }
}

