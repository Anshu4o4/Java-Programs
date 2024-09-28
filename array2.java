import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<5;i++){
            if(i==num){
                int j=i;
                System.out.println(j);
            }
            else{
                System.out.println("number not found");
            }
        }
        
    }
    
}
