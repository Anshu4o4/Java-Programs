//Check Wether the number is prime or not

import java.util.Scanner;

public class prime_OR_not{
    public static void main(String aurgs[]){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();

      for(int i=0;i<t;i++){
           int n=sc.nextInt();

           int score=0;
           for(int div=2;div*div<=n;div++){
            if(n%div==0){
                score++;
                break;
            }
           }
           if(score==0){
            System.out.println("prime number");
           }
           else{
            System.out.println("not prime");
           }
      }
    }
}