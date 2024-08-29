public class insertElement {
    public static void main(String[] args) {
        int A[]= new int[10];

        A[0]= 5;
        A[1]= 9;
        A[2]= 4;
        A[3]= 10;
        A[4]= 12;
        A[5]= 7;
        int n = 6; // no. of elements in array (0-5)
        
        for(int i=0; i<n; i++){
            System.out.print(A[i]+ ",");
        }

        int x =15; //value u want to insert at index 2
        int index = 2; //index where u want to insert
        
        System.out.println(" ");

        for(int i= n; i>index; i--){
            A[i]= A[i-1]; // copy elemt from prev index  (shifting of elemnts)
        }
        A[index] = x; //inserts new element
        n++;

        for(int i=0; i<n; i++){
            System.out.print(A[i]+ ",");
        }
    }
}
