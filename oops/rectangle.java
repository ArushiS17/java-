class rectangles{
    private double length;
    private double breadth;

    //getter (for reading the property)
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    //setter (for writing the property)
    public void setLength(double l){
        if (l>=0){
            length=l;
        }
        else{
            length=0;
        }
       
    }
    public void setBreadth(double b){
        if (b>=0){
            breadth=b;
        }
        else{
            breadth=0;
        }
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}

public class rectangle {
    public static void main(String[] args) {
        rectangles R1 = new rectangles();
        rectangles R2 = new rectangles();

        //setters(writing)
        R1.setLength(-10.5);
        R1.setBreadth(8);

        R2.setLength(15);
        R2.setBreadth(15);

        //getters(reading)
        System.out.println("length of R1: " + R1.getLength());
        System.out.println("breadth of R1: " + R1.getBreadth());
        System.out.println("length of R2: " + R2.getLength());
        System.out.println("breadth of R2: " + R2.getBreadth());

System.out.println(" ");

        System.out.println("area of R1: "+ R1.area());
        System.out.println("perimeter of R1: "+R1.perimeter());
        System.out.println("is R1 a square: "+ R1.isSquare());

        System.out.println("area of R2: "+ R2.area());
        System.out.println("perimeter of R2: "+R2.perimeter());
        System.out.println("is R2 a square: "+ R2.isSquare());



    }
}
