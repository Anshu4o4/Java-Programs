
//Find the number of ways in which you can invite people to your party, single or pairs. using Recursion

public class call_Guest_Recursion {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        int ways1 = callGuest(n-1);
        int ways2= (n-1) * callGuest(n-2);
        return ways1 + ways2;
    }
    public static void main(String aurgs[]){
        int n =4;
        System.out.println(callGuest(n));
    }
}
