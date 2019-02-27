package modules.loops.loopsAndConditions;

public class App {
    public static String shouter(String str) {
        int length = str.length();
        String result = "";

        if (length > 0 && length < 5) {
            return str;
        } else if (length == 5) {
            int counter = 0;
            int counterLimit = 10;
            while (counter != counterLimit) {
                result += str;
                counter += 1;
            }
        } else {
            int counter = 0;
            int counterLimit = 100;

            while (counter != counterLimit) {
                result = str;
                counter += 1;
            }
        }
        return result;
    }
}
