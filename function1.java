import java.util.*;
public class function1 {
     public static int average(int a, int b, int c){
        
        int avg=a+b+c/3;
        System.out.print("average is :");
        System.out.println(avg);
        return avg;

     }

public static void main(String aurgs[]) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    average(a, b, c);

    
}
    
}
