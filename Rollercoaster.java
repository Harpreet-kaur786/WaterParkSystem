public class Rollercoaster extends CarnivalRide {
    private int loops;
    
    //constructor of rollercoster
    public Rollercoaster(long duration, int loops) {
        super("Rollercoaster", duration);
        this.loops = loops;
    }

    
    public Rollercoaster(long duration, String name, int loops) {
        super("Rollercoaster", duration, name);
        this.loops = loops;
    }

    //getter and setter methods
    public int getLoops() {
        return loops;
    }

    public void setLoops(int loops) {
        this.loops = loops;
    }
 // Implement fearFactor method
 @Override
 public String fearFactor() {
     String durationDescription;
     int minutes = minutes();
     if (minutes >= 6) {
         durationDescription = "terrifying";
     } else if (minutes >= 3) {
         durationDescription = "scary";
     } else {
         durationDescription = "not scary";
     }

     String loopsDescription;
     if (loops >= 5) {
         loopsDescription = "exhilarating";
     } else if (loops >= 3) {
         loopsDescription = "intermediate";
     } else {
         loopsDescription = "moderate";
     }
    String Duration = "\nIt is both " + durationDescription + " and is " + loopsDescription + ".\n";
     return Duration;
 }

// Implement aboutRide method
@Override
public String aboutRide() {
    String Ride= "This carnival ride is a " + getType() + ", and its name is " + getName() + ". " +
           fearFactor() + "This ride lasts " + minutes() + " minutes and has " + loops + " loops.";
           System.out.println();
    return Ride;
}

    @Override
    public String toString() {
        return super.toString() + "\n" +"Loops: \t\t" + loops + "\n" ;
   
    }
}
