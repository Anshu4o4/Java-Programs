import java.util.Scanner;

public class function5 {
    public static void vote(int age) {
        if(age>18){
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println("you can't vote");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vote(age);
    }

}
