package PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPatterns = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfPatterns; i++) {
            String pattern = scanner.nextLine();
            System.out.println(pattern);
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
