package RegularExpressions;

import java.util.Arrays;

public class RegExp2 {
    public static void main(String[] args) {
        String a = "Hello24124there24124hey";
        System.out.println(Arrays.toString(a.split("\\d+")));

        //replace принимает строку
        //replaceAll принимает регулярное выражение
        String b = "Hello there hey";
        String c = "Hello124124there4124hey";
        System.out.println(b.replace(" ", "."));
        System.out.println(c.replaceAll("\\d+", "-"));

        String number = "+996 555-55-57-75";
        System.out.println(number.replaceAll("[^0-9]", ""));

    }
}
