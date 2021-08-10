import jdk.vm.ci.code.stack.StackIntrospection;

public class oopsMethodOverloading {

    public static void main(String args[]){

        overloadExample ol = new overloadExample();
        ol.setVar1(10);
        int squareVal  = ol.generateValue(10, 20);
        System.out.println("Queare genaretd value is "+ squareVal);
        int cubeValue  = ol.generateValue(2, 3, 4);
        System.out.println("Cube value is is "+cubeValue);

    }
    
}

class overloadExample {
    public int var1;
    public int var2;
    public int var3;

    public int getVar1() {
        return this.var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return this.var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public int getVar3() {
        return this.var3;
    }

    public void setVar3(int var3) {
        this.var3 = var3;
    }

    public int generateValue(int a , int b){
        return a*b;
    }

    public int generateValue(int a, int b , int c){
        return a*b*c;
    }


    
}
