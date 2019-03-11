public class App {
    public static void main(String[] args) throws Exception {
        String from = "The Twins";
        String to = "The Eyrie";

        // BEGIN
        int distance = Functions.calculateDistanceBetweenTowns(from + "-" + to);
        System.out.print(distance);
        // END
    }
}
