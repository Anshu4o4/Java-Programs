 
  // Chect wether the arrat is so9rted or not(Strictly increasing) using Recursion

public class isSorted_Recursion {
    public static boolean isSorted(int arr[], int idx){
           if(idx==arr.length-1){
            return true;
           }
           if(arr[idx]>=arr[idx+1]){
            return false;
           }
           return isSorted(arr, idx+1);
    }

    public static void main(String aurgs[]){
        int arr[]={1,2,3};
       System.out.println(isSorted(arr, 0));
    }
    
}
