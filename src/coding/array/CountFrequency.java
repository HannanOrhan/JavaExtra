package coding.array;

public class CountFrequency {
    public static void charFreq(char[] chars){
        String s ="",s2="",s3="";
        for (char each : chars) {
            int count=0;
            for (char each2 : chars) {
                if (each==each2){
                    count++;
                }
            }
            if (!s.contains(each + "" + count)){
                s += each + "" + count;
                s2+=each;
                s3+=count;
            }
        }
        if (s.length()==2){
            System.out.println(s.charAt(0));
        }else {
            System.out.println(s);
            System.out.println(s2 + s3);
        }
    }
    public static void main(String[] args) {
         char[] chars = {'a'};
        char[] chars2 = {'a','b','b','b','b'};
        char[] chars3 = {'a','b','b','b','b','c','c','a','d','d'};
         charFreq(chars);
         charFreq(chars2);
         charFreq(chars3);
    }
}
  /*
    Example 1:
        Input: chars = ["a","a", "b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array should be: ["a", "2", "b","2","c","3"]
            Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    Example 2:
        Input: chars = ["a"]
        Output: Return 1, and the first character of the input array should be: ["a"]
        Explanation: The only group is "a", which remains uncompressed since it's a single character.
    Example 3:
        Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
        Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
     */