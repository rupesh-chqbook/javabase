

public class multipleInheritance {

    public static void main(String args[]){
        System.out.println("Calling ");
        yug y = new yug();
        y.show();
    }
}

interface mother{
    default void show(){
        System.out.println("Mother interface is being calld");
    }
}

interface father{
    default void show(){
        System.out.println("Father interface is being calld");
    }
}

class yug implements mother, father{
    public void show(){
        father.super.show();
        mother.super.show();
    }
}