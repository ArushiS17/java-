
//ABSTRACT CLASSES MENT ONLY FOR INHERITENCE

abstract class Super{
    //constructor
    public Super(){System.out.println("super constructor");}
    //methods
    public void method1(){
        System.out.println("method1 of Super");
    }
    abstract public void method2(); //no body of abstract methods
}
class Sub extends Super{ //child class of abstract class is abstract unless overriden.
    @Override
    public void method2(){
        System.out.println("Sub method2");
    }
}

public class abstractEg {
    public static void main(String[] args) {
        Super s= new Sub(); //abstract class reference can be taken
        s.method1();
        s.method2();

        // Super s1= new Super(); //cant create object of abstract class
    }
}
