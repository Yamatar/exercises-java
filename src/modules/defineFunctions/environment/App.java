public class App {
    public static String getAgeDifference(int yearOne, int yearTwo)
    {
        int difference = Math.abs(yearOne - yearTwo);
        return "The age difference is " + difference;
    }
}
