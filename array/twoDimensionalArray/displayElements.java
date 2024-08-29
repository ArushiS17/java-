// package twoDimensionalArray;

public class displayElements {
    public static void main(String[] args) {
         int B[][]= {{1,2,3},{2,4,6},{1,3,5}};

         //for loop
         for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
         }

         //for each loop
         for(int x[]: B){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println(" ");
         }

         System.out.println(B);
         System.out.println(B.length); // 3 rows
    }
}
