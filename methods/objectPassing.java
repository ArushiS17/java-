
public class objectPassing {

    static void change (int X[], int index, int value){ //object parameter- changes value of actual parameter
        X[index]= value;
    }

    static void change2(int x, int value){ //primitive dataype parameter- dosent change value of actual parameter
        x=value;
    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};

        change(A,2,20);

        for(int i =0; i<A.length; i++){
            System.out.print(A[i]+ ","); //change
        }

        System.out.println(" ");

        int x=10;
        change2(x,20); //no change
        System.out.println("value of primitive datatype "+ x);

    }
}
