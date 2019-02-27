package modules.callingFunctions.immutabilityOfPrimitiveTypes;


public class App {
    public static void main(String[] args) throws Exception {
        String str = "a mind needs books as a sword needs a whetstone, ifOperator it is to keep its edge.";

        // BEGIN
        str = str.toUpperCase();
        // END
        System.out.print(str);
    }
}
