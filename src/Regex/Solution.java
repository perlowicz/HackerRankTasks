package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String singleBit = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
        Pattern pattern = Pattern.compile(singleBit + "\\." + singleBit + "\\." + singleBit + "\\." + singleBit);
        while (scanner.hasNextLine()){
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            System.out.println(text);
            if (matcher.matches())
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
