class cylinder{
    private int radius;
    private int height;

public cylinder(){
    radius=1;
    height=1;
}
    
public cylinder(int r, int h){
    setRadius(r);
    setHeight(h);
}

//property methods
public int getRadius(){
    return radius;
}
public int getHeight(){
    return height;
}
public void setRadius(int r){
    if(r>=0){
        radius=r;
    } else{
        radius=0;
    }
}
public void setHeight(int h){
    if(h>=0){
        height=h;
    }else{
        height=0;
    }
}
public void setDimensions(int h,int r){
    height=h;
    radius=r;
}


public double lidArea(){
    return Math.PI*radius*radius;
}
public double perimeter(){
    return 2*Math.PI*radius;
}
public double drumArea(){
    return 2*lidArea()+perimeter()*height;
}
public double volume(){
    return lidArea()*height;
}
}
public class CylinderCalc {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setRadius(8);
        c.setHeight(10);
        c.setDimensions(5,6);

        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height "+c.getHeight());
        System.out.println("Radius "+c.getRadius());

    }
}
