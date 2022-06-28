package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = Integer.parseInt(scanner.nextLine());
            int y = Integer.parseInt(scanner.nextLine());

            System.out.println(x/y);
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e){
            System.out.println(e);
        }
    }
}
