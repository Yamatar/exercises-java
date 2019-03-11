import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static String getCustomDate(int timestamp)  {
        Date date = new Date(timestamp);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        return format1.format(date);
    }
}
