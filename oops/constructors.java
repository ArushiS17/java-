class rectangle{
    private double length;
    private double breadth;

    //non-parameterised constructor:
    public rectangle(){
        length=1;
        breadth=1;
    }
    //parameterised constructor
    public rectangle(double l,double b){
        setLength(l);
        setBreadth(b);
    }
    public rectangle(double s){
        length=breadth=s; //incase of sqaure
    }

    //getter-setter:
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>=0){
            length=l;
        }else {
            length=0;
        }
    }
    public void setBreadth(double b){
        if(b>=0){
            breadth=b;
        }else {
            breadth=0;
        }
    }

    //formulas(methods)
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){ //methods starting with "is" are inquiry methods
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}


public class constructors {
    public static void main(String[] args) {
        rectangle r1= new rectangle(); //calling non-parametrised const.
        rectangle r2= new rectangle(20,10);
        rectangle r3= new rectangle(5);
        rectangle r4= new rectangle(-7,-6); //why get-set method was used.

        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
        System.out.println(r3.isSquare());
        System.out.println(r4.area());

    }
}
