public class App {
    public static void main(String[] args) throws Exception {
        var distance = Functions.calculateDistance("Winterfell", "The Twins") + Functions.calculateDistance("The Twins", "The Eyrie");
        System.out.print(distance);
    }
}
