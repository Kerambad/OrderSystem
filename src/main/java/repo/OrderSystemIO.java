package repo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderSystemIO {

    public static int intInput(String toPrint) {
        Scanner inputScan = new Scanner(System.in);
        System.out.print(toPrint);

        int number = 0;
        try {
            number = inputScan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter an int");
        }
        return number;
    }

}
