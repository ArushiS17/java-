
class Circle{

    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2* Math.PI * radius;
    }
    public double circumference(){
        return perimeter(); //circumference= perimeter, so call perimeter
    }
}

public class Circle1 {
    public static void main(String[] args) {
        Circle c1= new Circle(); //creates new object in heap
        Circle c2= new Circle();

        c1.radius=7;//initialise radius
        c2.radius=10;

        System.out.println("area of c1: " + c1.area());
        System.out.println("periemeter of c1: "+c1.perimeter());
System.out.println();
        System.out.println("area of c2: " + c2.area());
        System.out.println("periemeter of c2: "+c2.perimeter());
        
    }

}
