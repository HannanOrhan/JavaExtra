package javaCoding;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDup(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        return result;
    }
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            System.out.println( removeDup(str) );
        }
}
