public class App {
    public static boolean doesContain(String str, char symbol) {
        int index = 0;
        while (index < str.length()) {
            if (str.charAt(index) == symbol) {
                return true;
            }

            index++;
        }
        return false;
    }
}
