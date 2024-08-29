
public class discount {
    static double sum(double ...P){
        int sum=0;
        for(int i=0; i<P.length;i++){
            sum += P[i];
        }
        if (sum<=500) return sum*0.1;
        else if (sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.2;
    }
    public static void main(String[] args) {
        System.out.println(sum(800,900));
    }
}
