abstract class Shape{
    //no properties

    //methods
    abstract public double Perimeter();
    abstract public double area();
}
class Circle extends Shape{
    
    double radius;
    public double Perimeter(){
        return 2* Math.PI * radius;
    }
    public double area(){
       return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    
    double length;
    double breadth;
    public double Perimeter(){
        return 2*(length + breadth);
    }
    public double area(){
        return length * breadth;
    }
}

public class shapeEg {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.length= 10;
        r.breadth= 20;
        System.out.println(r.area());

        Shape s= r;
        System.out.println(s.area()); 

        Shape x= new Circle();
        System.out.println(x.area());
    }
}
