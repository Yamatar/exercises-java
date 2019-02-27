package modules.loops.reverseString;

public class App {
    // BEGIN
    public static String mysubstr(String str, int length)
    {
        int index = 0;
        String result = "";
        while (index < length) {
            char currentChar = str.charAt(index);
            result = result + currentChar;
            index = index + 1;
        }

        return result;
    }
    // END
}
