public class App {
    public static String filterString(String str, char symbol) {
        int index = 0;
        int length = str.length();
        String result = "";
        while (index < length) {
            char currentChar = str.charAt(index);
            if (currentChar != symbol) {
                result += currentChar;
            }
            index++;
        }

        return result;
    }
}
