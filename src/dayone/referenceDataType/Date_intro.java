package dayone.referenceDataType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_intro {

    public static void main(String[] args) throws ParseException {
         Date date = new Date();
         System.out.println(date);

         long time = date.getTime();
         System.out.println(time);

         SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY"); // alt enter for the import

        Date date1 = dateFormat.parse("2/4/2019");
        System.out.println(date1);

    }
}
