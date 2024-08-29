

public class variableArg {
    static void show(int ...A){ //more powerful than array as it allows other 2 ways also.
        for(int x:A){
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
        show();
        show(1,2,3,4);
        show(new int[]{3,5,2,6,7,4}); //anonymous array
    }
}
