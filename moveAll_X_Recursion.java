
// Move all x at the end of the string using Recursion
public class moveAll_X_Recursion {

    public static void moveALLX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curentChar = str.charAt(idx);
        if (curentChar == 'x') {
            count++;
            moveALLX(str, idx + 1, count, newString);
        } else {
            newString += curentChar;
            moveALLX(str, idx + 1, count, newString);
        }
    }

    public static void main(String aurgs[]) {
        String str = "axbcxxd";
        moveALLX(str, 0, 0, "");

    }

}
