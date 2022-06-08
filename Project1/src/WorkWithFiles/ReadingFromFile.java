package WorkWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator+"dierumurzakov"+separator+
                "IdeaProjects"+separator+"Project1"+separator+"NewFile.txt";

        File file = new File("NewFile.txt");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] s = line.split(",");
        int[] n = new int[3];
        int c=0;
        for(String s1 : s){
            n[c++] = Integer.parseInt(s1);
        }
    }
}
