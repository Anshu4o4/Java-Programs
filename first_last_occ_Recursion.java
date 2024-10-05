
// Find first and last occurance of any element from string using Recursion


public class first_last_occ_Recursion {
    public static int first= -1;
    public static int last= -1;

    public static void findoccurance(String str,int idx, char element){
       if(idx==str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
       }
        char curentChar=str.charAt(idx);
        if(curentChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findoccurance(str, idx+1, element);
    }

    public static void main(String aurgs[]){
      String str="abaacdaefaah";
      findoccurance(str, 0, 'a');
    }
    
}
