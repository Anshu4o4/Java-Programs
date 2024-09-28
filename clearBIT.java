public class clearBIT {
    public static void main(String aurgs[]){
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int nott= ~(bitmask);
        int newnum=nott & n;
        System.out.println("0101 after clear method: "+ newnum);
    }
    
}
