//program to print numbers 5 to 1 using recursive function
public class recursion1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printNum(n);
    }
    
}
