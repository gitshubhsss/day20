
public class recursion {
    public static void printIncresing(int n) {
        if(n==0){
            return;
        }
        printIncresing(n-1);
        System.out.println(n);

    }
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
       
        int n=5;
        // printIncresing(n);
        printDecreasing(n);
    }
}
