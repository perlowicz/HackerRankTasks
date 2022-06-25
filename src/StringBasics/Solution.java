package StringBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(s.length()+s2.length());
        if (s.compareTo(s2) > 0)
            System.out.println("Yes");
        else if (s.compareTo(s2) < 0)
            System.out.println("No");

        System.out.println(s.substring(0,1).toUpperCase() + s.substring(1) + " " + s2.substring(0,1).toUpperCase() + s2.substring(1));
    }
}
