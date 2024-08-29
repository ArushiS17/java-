package twoDimensionalArray;

public class creating2dArray {
    public static void main(String[] args) {
        //declaring array - 3 methods:
        int A[][]= new int [5][5];
        int B[][]= {{1,2,3},{2,4,6},{1,3,5}};
        int C[][];
        C = new int [5][5];

        int []D[] = new int [2][3]; //valid

        int [] E, F[]; //if we put semi colon after E it becomes:
                       //int [] E;
                       //,F[]; (or int []F[];)

        E = new int[5]; //E is single dimension array
        F = new int[5][5]; //F is 2d array


        int [] G,H,I,J; //all 1D arrays
        // int [] G,H,I,J[]; //J becomes 2D
    }
}
