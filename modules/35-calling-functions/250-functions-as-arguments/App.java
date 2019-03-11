import main.java.Functions;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print(Functions.parentFor(Functions.parentFor("Joffrey Baratheon"), "father"));
    }
}
