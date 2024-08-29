final class test{
    public final void show(){
        System.out.println("hello");
    }
}
class test1 extends test{ //cant be exteded by final class
    public void show(){} //cant override final methods
}


public class finalPractice {
    final float pi; //cant have un-initialised memebers, cant be initialised later also. 
    {
        // pi=3.14f; //can be initialised in block (instance block)
    }
    //contructor to initialise data members
    public finalPractice(){
        pi=3.14f;
    }
    public static void main(String[] args) {
        final int x=10;
        final float PI;
        PI=3.14f;
        System.out.println(pi); //cant use non static member in static method
    }
}
