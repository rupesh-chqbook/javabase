public class oopsInheritance {

    public static void main(String[] args) {
        govtSchool gvt = new govtSchool("Indraprastha", "Dwarka Secotr 22", "Ne Delhi", "IP0101");
        gvt.displaySchoolDetail();
    }
    
}

class school{
    private String schoolName;
    private String location;
    private String cityName;

    school(String name, String loc, String city){
        this.schoolName = name;
        this.location = loc;
        this.cityName = city;
    }

    public void displaySchool(){
        System.out.println("PARENT CLASS");
        System.out.println("Name of school is "+ this.schoolName);
        System.out.println("Location of school is "+this.location);
        System.out.println("City od school is "+ this.cityName);
    }
}

class govtSchool extends school{

    private String estbNo;

    govtSchool(String name, String loc, String city, String est) {
        super(name, loc, city);
        //TODO Auto-generated constructor stub

        this.estbNo = est;
    }

    public  void displaySchoolDetail(){
        displaySchool();
        System.out.println("CHILD CLASS");
        System.out.println("Estabish no is "+ this.estbNo);
    }
    
}