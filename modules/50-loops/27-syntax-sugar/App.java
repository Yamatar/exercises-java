public class App {
    public static int countChars(String str, char symbol) {
        int index = str.length() - 1;
        int result = 0;
        while (index >= 0) {
            if (str.charAt(index) == symbol) {
                result += 1;
            }
            index -= 1;
        }

        return result;
    }
}
