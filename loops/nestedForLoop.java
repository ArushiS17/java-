public class nestedForLoop {
    public static void main(String[] args) {
    
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                System.out.print("("+ i + "," + j + ")"); //completes 1 row
            }
            System.out.println(" ");
        }
    }
}
