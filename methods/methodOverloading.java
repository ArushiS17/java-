
public class methodOverloading {
    static int max(int x, int y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        if (x>y){
            return x;
        }else
        return y;
    }
    static int max(int x, int y,int z){
        return x>y && x>z? x:(y>z? y:z); //if x>y and X>z give x, else if y>z, give y varna z 
    }
    public static void main(String[] args) {
        System.out.println(max(56,78,33));
        
    }
}
