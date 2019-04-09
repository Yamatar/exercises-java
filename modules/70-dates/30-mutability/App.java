import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // BEGIN
        var date = new Date();
        date.setYear(date.getYear() + 1);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print(format1.format(date));
        // END
    }
}
