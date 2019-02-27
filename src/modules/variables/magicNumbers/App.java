package modules.variables.magicNumbers;

public class App {
    public static void main(String[] args) {
        String king = "King Balon the 6th";

        // BEGIN
        int numberOfCastles = 6;
        int roomsPerCastle = 17;
        System.out.print(king + " has " + (numberOfCastles * roomsPerCastle) + " rooms.");
        // END
    }
}
