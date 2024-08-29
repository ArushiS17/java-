public class maxNum {

    int max(int x, int y){
        if(x>y)
         return x;
        else 
         return y;

    }
    public static void main(String[] args) {
        int a=10, b=15;
        maxNum num = new maxNum(); //creating object to call non-static methods into main
        System.out.println(num.max(a,b));
    }
}
