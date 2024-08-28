import java.util.Scanner;

public class function4 {
public static int circ(int r){
       int c=2*(22/7)*r;
       return c;
}
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        
       System.out.println("circumference of circle is: "+circ(r));
        
    }
    
}
