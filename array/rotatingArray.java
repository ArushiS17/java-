public class rotatingArray {
    public static void main(String[] args) {
        
        //LEFT ROATATION :
        //rotating to left means all elements moved to left b 1 space, 1st elemnt becomes last
        // eg: arr = 1568 becomes 5681

        int A[] = {1,6,2,0,7,8,4,9,3,5}; //first element becomes last

        int temp = A[0];
        //initialise for loop from 1 not 0
        for(int i = 1; i<A.length; i++){
            A[i-1]= A[i];
        }
        A[A.length-1] = temp; //copy temporary value to last index

        //print array:
        for (int x:A){
            System.out.print(x);
        }

System.out.println(" ");


        //RIGHT ROTATION :
        //start from last element
        int B[] = {7,9,8,3,2,5,4,1,0,6}; //last element becomes first

        int temporary = B[B.length-1];

        for(int j = B.length-1; j>0; j-- ){
            B[j]= B[j-1];
        } 
        B[0] = temporary;

        for(int y: B){
            System.out.print(y);
        }

    }
}
