  //Program to remove dublicates from string using Recursionn

public class remove_Dublicat_Recursion {

    public static boolean map[] = new boolean[26];

    public static void removeDublicates(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDublicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDublicates(str, idx + 1, newString);
        }

    }

    public static void main(String aurgs[]) {
        String str = "abbccda";
        removeDublicates(str, 0, "");
    }

}
