public class App {
    public static String invertCase(String text) {
        // BEGIN
        int length = text.length();
        String result = "";
        for (int index = 0; index < length; index++) {
            if (Character.isUpperCase(text.charAt(index))) {
                result += Character.toLowerCase(text.charAt(index));
            } else {
                result += Character.toUpperCase(text.charAt(index));
            }
        }
        return result;
        // END
    }
}
