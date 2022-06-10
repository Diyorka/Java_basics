package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        //() - группа

        String text = "Hello, guys! This is my email diyorka@mail.ru\n" +
                "Hello, Diyor! Thank you, here is my email: abc@gmail.com";
        Pattern email = Pattern.compile("(\\w+)@(mail|gmail)\\.(ru|com)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
