package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws ScannerException {
        Scanner sc = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(sc.nextLine());

            if(x != 0){
                throw new ScannerException("Не нуль");
            }
        }
    }
}


//Checked exceptions - ошибки, которые сразу IDE выдает
//Unchecked exceptions - ошибки, которые происходят во время компиляции. Например, деление на 0