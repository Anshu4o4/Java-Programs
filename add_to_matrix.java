import java.util.Scanner;

public class add_to_matrix {
    public static void main(String[] args){
      int [][]a=new int[2][2];
      int [][]b=new int[2][2];
      int [][]c=new int[2][2];
      int i,j;
      Scanner sc= new Scanner(System.in);
System.out.println("enter value of mat a:");
      for(i=0;i<3;i++){
        for (j = 0; j < 3; j++) {
            a[i][j]=sc.nextInt();
        }
      }
      System.out.println("value of mat a:");
      for(i=0;i<3;i++){
        for (j = 0; j < 3; j++) {
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("enter value of mat b:");
      for(i=0;i<=3;i++){
        for (j = 0; j < 3; j++) {
            b[i][j]=sc.nextInt();
        }
      }

      System.out.println("value of mat a:");
      for(i=0;i<3;i++){
        for (j = 0; j < 3; j++) {
        System.out.print(b[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("sum of two matrix: ");
      for(i=0;i<3;i++){
        for (j = 0; j < 3; j++) {
         c[i][j]=a[i][j]+b[i][j];
         System.out.print(c[i][j]+" ");
        
        }
        System.out.println();
      }

    
      
    }
    
}
