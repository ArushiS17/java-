

public class parameterPassing {
    static void inc(int x){ //void- no return value
        x++; //INT X IS FORMAL PARAMETER
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a=20, b=10; //ACTUAL PARAMETERS
        inc(a); //calling method
        System.out.println(a);
    }
}

//value of actual parameters remain unchanged even if value of formal parameters are changed.
//value of actual parameters are simply copied to formal parameters- this is parameter passing
