import java.math.BigInteger;
import java.util.*;

public class factorial {
    
    public static void fact(int n){
        if(n<0){
            System.out.println("invalid num");
            return;
        }
        BigInteger factoriall=BigInteger.ONE;

         for(int i=n;i>=1;i--){
            factoriall=factoriall.multiply(BigInteger.valueOf(i)); 
         }
         System.out.println(factoriall);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
        
    }
}
