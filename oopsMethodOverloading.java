
public class oopsMethodOverloading {

    public static void main(String args[]){

        overloadExample ol = new overloadExample();
        int squareVal  = ol.generateValue(10, 20);
        System.out.println("Queare genaretd value is "+ squareVal);
        int cubeValue  = ol.generateValue(2, 3, 4);
        System.out.println("Cube value is is "+cubeValue);

    }
    
}

class overloadExample {


    public int generateValue(int a , int b){
        return a*b;
    }

    public int generateValue(int a, int b , int c){
        return a*b*c;
    }


    
}
