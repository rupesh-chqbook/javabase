import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

public class questionInheritance {
    
    public static void main(String args[]){
        car c1= new car();
        String ss = c1.getDetails("Roadster");
        System.out.println(ss);
    }
}

class vehicle{
    public String model;
    public String speed;

}

class car extends vehicle {
    public String name; //  Name of a Car
  
    public car() { // Default Constructor
      name = "";
    }
    
    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
      this.name = name;
      this.model ="Tesla";
      this.speed="100";

    }
    
    // This function calls the Base class functions and appends the input to the result
    public String getDetails(String carName) { 
      String details = carName;
      this.model ="Tesla";
      this.speed="100";
      //System.out.println(details+", "+this.model+", "+this.speed);
      
      // write your code here
      
      return details = details+", "+this.model+", "+this.speed;
    }
}