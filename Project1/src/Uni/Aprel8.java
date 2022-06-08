package Uni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aprel8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"));
        String line;
        int c = 0;
        while((line=br.readLine())!=null){
            String[] s = line.split(" ");
            for (int i = 0; i < s.length; i++) {
                c++;
            }
        }
        System.out.println(c);
    }
}
