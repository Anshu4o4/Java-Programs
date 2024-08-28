import java.util.Scanner;

public class function3 {
    public static int gtrLsr(int a, int b){
        int result;
        if(a>b){
        result=a;
        }
        else{
            result=b;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
        System.out.println("Grater num. is: "+gtrLsr(a, b));
        
    }
}
