
public class calculateArea {
    static int area(int l, int b){
        int area= l*b;
        return area;
    }

    static double area(int r){
        double area = Math.PI*r*r;
        return area;
    }
    static double area(int a, int b, int h){
        double area = (0.5*(a+b)*h); //trapezium
        return area;
    }
    public static void main(String[] args) {
        System.out.println(area(7));
    }
}
