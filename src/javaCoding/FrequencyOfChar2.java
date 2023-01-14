package javaCoding;

public class FrequencyOfChar2 {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = "";

        for (char each : str.toCharArray()) {
            int count=0;
            for (char c : str.toCharArray()) {
                if (each==c){
                    count++;
                }
            }
            if (!result.contains(String.valueOf(each))){
                result += each + String.valueOf(count);
            }
        }
        System.out.println(result);
    }
}
