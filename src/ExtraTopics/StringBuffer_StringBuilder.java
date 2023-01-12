package ExtraTopics;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {
        String string = "Wooden";
        string = string.concat(" Spoon");//it creates new object Wooden Spoon
        //If we not assign it returns Wooden only
        System.out.println(string); //Wooden Spoon


        System.out.println("-----------------------------------------------------------");

        StringBuilder stringBuilder = new StringBuilder("Wooden");//not synchronized
        stringBuilder.append(" Spoon"); //SB is mutable we don't need to reassign
        System.out.println(stringBuilder); //Wooden Spoon

        System.out.println("-----------------------------------------------------------");

        StringBuffer stringBuffer = new StringBuffer("Wooden");//synchronized
        stringBuffer.append(" Spoon");//SB is mutable we don't need to reassign
        System.out.println(stringBuffer);//Wooden Spoon


        System.out.println("-----------------------------------------------------------");

    }
}
