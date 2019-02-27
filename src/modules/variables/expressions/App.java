package modules.variables.expressions;

public class App {
    public static void main(String[] args) {
        double euros = 100;

        // BEGIN
        double dollars = euros * 1.25;
        System.out.print(dollars);
        System.out.print("\n");
        double rubles = dollars * 60;
        System.out.print(rubles);
        // END
    }
}
