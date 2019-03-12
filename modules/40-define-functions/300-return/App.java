public class App {
    public static int getParentNamesTotalLength(String child) throws Exception{
        String mother = Functions.parentFor(child, "mother");
        String father = Functions.parentFor(child, "father");
        return mother.length() + father.length();
    }
}
