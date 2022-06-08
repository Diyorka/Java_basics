package Uni;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateJava {
    public static void main(String[] args) {
        SimpleDateFormat d = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);
        Date date = new Date();
        System.out.println(d.format(date));
        Date date2 = new Date(((date.getTime()/60000)+43200)*60000);
        System.out.println(d.format(date2));
    }
}
