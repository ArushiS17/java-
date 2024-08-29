
class Parent{
    Parent(){
        System.out.println("non parameterised const. of Parent");
    }
    Parent(int x){
        System.out.println("parameterised const. of Parent ");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("non parameterised const. of child");
    }
    Child(int x){
        System.out.println("parameterised const. of Child");
    }
    Child(int x, int y){ //to call parameterised const. of Parent class
        super(x);
        System.out.println("2 const. of Child class"); 
        //x value for parent class, y for child
    }
}

public class paramConst {
    public static void main(String[] args) {
        Child c1= new Child();
        System.out.println();
        Child c2= new Child(10); //calling parameterised const. of child calls non-parameterised const of parent.
        System.out.println();
        Child c3= new Child(10,20);
        System.out.println();
        Parent p = new Parent(10);
    }
}
