// package array;

public class firstArray {
    public static void main(String[] args) {
        //declaring array
        int A[]= new int[10]; //created in heap
        //declaring and initialising array
        int B[]= {1,2,3,4,5}; 
        B[2] = 15; //changing values
        //assigning array to reference
        int C[];
        C = new int[10];

        int []D; //can be decalred this way also

        //accessing elements of array B by for loop(counter controoled for-loop)
        for(int i= 0; i<B.length; i++){
            System.out.print(B[i]);
        }

        //for-each loop
        for(int x:B){
            System.out.println(x); //only used to read elemnts, cant be used to modify (like if u use x++, it wont be incremented.) use for loop
        }

        //


    }
}
