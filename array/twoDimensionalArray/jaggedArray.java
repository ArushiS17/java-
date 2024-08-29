// package twoDimensionalArray;

public class jaggedArray {
    public static void main(String[] args) {
        int A[][];
        A = new int[3][]; //creates 3 rows
        A[0]= new int[5];
        A[1]= new int[3];
        A[2] = new int[8];

        //for loop
        for(int i=0; i<A.length;i++){
            for(int j=0; j<A[i].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }

        //for-each loop
        for(int x[]: A){
            for(int y: x){
                System.out.print(y +" ");
            }
            System.out.println(" ");
        }
    }

}
