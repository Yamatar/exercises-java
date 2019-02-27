package modules.logic.ternaryOperator;

public class App {
    public static String convertString(String string) {
        return Character.isUpperCase(string.charAt(0)) ? string : string.repeat(2);
    }

    public static String reverseString(String str)
    {
        int index = str.length() - 1;
        String result = "";

        for (; index >= 0; index--) {
            char currChar = str.charAt(index);
            result = result + currChar;
        }

        return result;
    }
}
