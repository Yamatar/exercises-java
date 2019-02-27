package modules.defineFunctions.naming;

public class App {
    public static void getFormattedBirthday(String day, String month, String year) {
        System.out.printf("%02d-%02d-%d", day, month, year);
    }
}
