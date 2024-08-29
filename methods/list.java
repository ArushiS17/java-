

public class list {
    static void showList(int start, String...S){
        for(int i=0; i<S.length;i++){
            System.out.println(start + ". "+ S[i]);
            start++; //starts list at 5 and increments it.
        }
    }
    public static void main(String[] args) {
        showList(5,"sara","jyotsna","nikhil", "jatin");
    }
}
