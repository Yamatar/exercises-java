package modules.logic.logicalOperators2;


public class App {
    public static boolean isNeutralSoldier(String color, String shield) {
        return (!"red".equals(color) && "black".equals(shield));
    }
}
