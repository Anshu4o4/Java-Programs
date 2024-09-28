public class bitmanip1 {
    public static void main(String Aurgs[]){
        int n=5;
        int pos=3;
        int mask=1<<pos;

        if((mask&n)==0){
            System.out.println("bit was zero");

        }
        else{
            System.out.println("bit was 1");
        }

    }
    
}
