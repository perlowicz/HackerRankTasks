package Palindrome;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        if (new StringBuilder(palindrome).reverse().toString().equals(palindrome))
            System.out.println("Yes");
        else System.out.println("No");
    }
}
