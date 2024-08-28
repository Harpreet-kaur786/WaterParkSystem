    /**
 * Abstract class representing a general carnival ride.
 * Contains common properties and methods for all rides.
 */
    
     public abstract class CarnivalRide {
         private String type;
         private long duration; //milliseconds
         private String name;
    
    
        // Constructor with type and duration, initializes name to "unknown"
         public CarnivalRide(String type, long duration) {
             this.duration= duration;
             this.type= type;
             this.name= "unknown";
         }
     
           
        // Constructor with type, duration, and name   
         public CarnivalRide(String type, long duration, String name) {
             this.type = type;
             this.duration = duration;
             this.name = name;
         }
    
         public String getType() {
             String gettingType = type;
             return gettingType;
        }
        
         public long getDuration() {
             long gettingDuration = duration;
             return gettingDuration;
         }
        
         public String getName() {
             String gettingName= name;
              return gettingName;
         }
         public void setType(String type) {
             this.type = type;
         }
    
         public void setDuration(long duration) {
             this.duration = duration;
         }    
         public void setName(String name) {
             this.name = name;
         }

         // Abstract methods to be implemented by subclasses
         public abstract String fearFactor();
    
         public abstract String aboutRide();
    
    // Convert duration to minutes
         public int minutes() {
            int durationMin=(int) (duration / 1000 / 60);
            return durationMin;
         }
    
        // Override toString to provide ride details
         @Override
         public String toString() {
             return "Type: \t\t" + type + "\nDuration: \t" + duration + "\nName: \t\t" + name ;
         }
     }
    
   