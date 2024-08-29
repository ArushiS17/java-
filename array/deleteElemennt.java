public class deleteElemennt {
    public static void main(String[] args) {

        int A[]= new int[10];
        A[0]= 5;
        A[1]= 9;
        A[2]= 6;
        A[3]= 10;
        A[4]= 12;
        A[5]= 7;
        int n = 6; // no. of elements in array (0-5)

        for(int x: A){
            System.out.print(x);
        }

        for(int i=2; i<5;i++){ //deletes elemnt at index1
            A[i-1]=A[i]; 
        }

        System.out.println("");
        for(int x:A){
            System.out.print(x);
        }
    }
}
