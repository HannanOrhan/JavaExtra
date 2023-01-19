package ExtraTopics;

public class TestMyFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface oddOrEven = a -> {
            if (a%2==0){
                System.out.println(a + " is even.");
            }else {
                System.out.println(a + " is even.");
            }
        };

        oddOrEven.function(3);

        MyFunctionalInterface2 mergeStrings = (n,m) -> {
            System.out.println(n + " : " + m);
        };

        mergeStrings.merge("hannan","SDET");
    }
}
