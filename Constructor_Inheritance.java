class Base1{
    Base1(){
        System.out.println("Base class constructor");
    }
    Base1(int x){
        System.out.println("The value of x is "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived1 class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("The value of y is "+y);
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2 class constructor");
    }
    Derived2(int x,int y,int z){
        super(x,y);
        System.out.println("The value of z is "+z);
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args) {
        Derived2 d = new Derived2(10,15,20);
    }
}
