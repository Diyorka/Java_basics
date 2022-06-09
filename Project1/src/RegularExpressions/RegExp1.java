package RegularExpressions;

public class RegExp1 {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна англ буква
            \\w = [a-zA-Z]
            + - 1 или более цифр
            * - 0 или более цифр
            ? - 0 или 1 символов до

            (x|y|z) - одна строка из множества

            [abc] = (a|b|c)
            [a-zA-z] - все английские буквы
            [0-9] = \\d
            [^abc] - символы, кроме [abc]

            . - любой символ/слово/строка

            {2} - 2 символа до
            {2,} - 2 или более символа
            {2,4} - от 2 до 4 символов

            ^abc - начинается с abc
         */


        String a = "-1525";
        String b = "4145";
        String c = "+215";
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "d75fsdf1542040";
        System.out.println(d.matches("[a-zA-Z57]+\\d*"));

        String e = "heallo";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url1 = "http://www.news.kg";
        System.out.println(url1 .matches("http://www\\..+\\.(com|kg)"));

        String f = "abc";
        System.out.println(f.matches("\\w{2}"));
        System.out.println(f.matches("\\w{3}"));

        String g = "abcdefg";
        System.out.println(g.matches("^abc\\w*"));
    }
}
