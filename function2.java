
import java.util.Scanner;


public class function2 {
    public static void sodd(int o){
        int a=0;
        for(int e=1;e<=o;e++){
            if(e%2!=0){
                a=a+e;
                
            }
        }
            System.out.println("sum of odd number is: "+a);
        

    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();
        sodd(o);
    }
}
