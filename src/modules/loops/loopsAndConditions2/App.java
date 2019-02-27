package modules.loops.loopsAndConditions2;

public class App {
    public static String getEvenNumbersUpTo(int num) {
        int counter = 1;
        String result = "";

        while (counter <= num) {
            if (counter % 2 == 0) {
                result = result + counter + ",";
            }

            counter += 1;
        }

        return result;
    }
}
