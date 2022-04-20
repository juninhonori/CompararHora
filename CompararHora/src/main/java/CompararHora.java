import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompararHora {

    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
            Date date1 = dateFormat.parse("2022-04-12");
            Date date2 = dateFormat.parse("2022-04-30");

            //Date datefinal = dateFormat.parse(date2 - date1);

            System.out.println("Date-1: " + dateFormat.format(date1));
            System.out.println("Date-2: " + dateFormat.format(date2));

            if(date1.before(date2)){
                System.out.println("Date-1 is before Date-2");
            } else if (date2.after(date1)){
                System.out.println("Date-2 is after Date-1");
            }
        } catch (ParseException ex) {
        }

    }

}
