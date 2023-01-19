package ExtraTopics;

public class TestMyFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface displayNum = a -> {
            System.out.println(a*100);
        };

        displayNum.function(3);

        MyFunctionalInterface2 mergeStrings = (n,m) -> {
            System.out.println(n + " : " + m);
        };

        mergeStrings.merge("hannan","SDET");
    }
}
