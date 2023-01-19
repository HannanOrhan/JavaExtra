package ExtraTopics;

public class TestGenericInterface {
    public static void main(String[] args) {
        GenericInterface<Integer> displayCube = (a) -> { //a(integer) side of cube
            System.out.println(a*a);
        };

        displayCube.function(3);

        GenericInterface<String> thirdChar = a -> {
            System.out.println(a.charAt(2));
        };

        thirdChar.function("hannan");
    }
}
