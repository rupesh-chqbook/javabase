class day1{
    public static void main(String args[]){
        String name = "Rupesh";
        System.out.println(name);
        example ex = new example(name);
        String returnName = ex.getname();
        // Private Vars access 
        System.out.println("Return name is "+returnName);
        //Public vars Access
        ex.age=22;
        System.out.println("Age is got is "+ ex.getAge());

        // Inheritance example
        exampleExtended exExt = new exampleExtended(name);
        String add = "Sector 22 Dwarka";
        //exExt.setAddres(add);
        //System.out.println("And the Adrees is "+exExt.getAddress());

        //Final variable 
        finalExample fe = new finalExample();
        System.out.print("Roll No is "+ fe.rollNo);
        // But cannot override this 
        //fe.rollNo=5;
    }
}

class example{

    private String name;
    public int age;
    protected String address;
    
    example( String n){

        this.name = n;

    }

    public int getAge(){
        return this.age;
    }

    public String getname(){

        return this.name;
    }


}

class exampleExtended extends example{

    exampleExtended(String n) {
        super(n);
        //TODO Auto-generated constructor stub
    }
    
    public setAddres(String add){
        super.address = add;
    }

    public String getAddress(){
        return super.address;
        
    }
}

class finalExample{
    final int rollNo =4;
}