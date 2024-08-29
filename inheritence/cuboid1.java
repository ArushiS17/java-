class Rectangle{
    int length;
    int breadth;
    int x=10;

    Rectangle(){
        length=breadth=1;
    }
    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rectangle{
    int height;
    int x=20; //name conflit. x in parent class also.

    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        height=h;
    }
    Cuboid(int l, int b, int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
     void display(){
        System.out.println(super.x); //parent class
        System.out.println(x); //current class  
    }

}

public class cuboid1 {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(3,6,5);
        System.out.println(c.volume());
        c.display();
    }
    

}
