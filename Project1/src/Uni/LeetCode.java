package Uni;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){
        StringBuffer s1 = new StringBuffer();
        s1.append(s);
        int num=0;
        while(s1.length()>0){
            switch(s1.charAt(s1.length()-1)){
                case 'I':
                    num+=1;
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    num+=10;
                    break;
                case 'L':
                    num+=50;
                    break;
                case 'C':
                    num+=100;
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
                    break;
            }
            s1.deleteCharAt(s1.length()-1);
        }
        return num;
    }
}
