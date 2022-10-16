package Lambdas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> myLines = new ArrayList<>();
        String singleLine = "";
        while ((singleLine = br.readLine()) != null) {
            myLines.add(singleLine);
        }

        br.close();

        myLines
                .stream().filter(l -> l.split(" ").length > 1)
                .forEach(
                line -> {
                    int command = Integer.parseInt(line.split(" ")[0]);
                    int value = Integer.parseInt(line.split(" ")[1]);

                    PerformOperation performOperation;

                    switch (command) {
                        case 1:
                            performOperation = number -> number % 2 != 0;
                            if (performOperation.check(value))
                                System.out.println("ODD");
                            else System.out.println("EVEN");
                            break;
                        case 2:
                            performOperation = number -> {
                                if (number <= 1)
                                    return false;
                                for (int i = 2; i <= Math.sqrt(number); i++)
                                    if (number % i == 0)
                                        return false;
                                return true;
                            };
                            if (performOperation.check(value))
                                System.out.println("PRIME");
                            else System.out.println("COMPOSITE");
                            break;
                        case 3:
                            performOperation = number -> {
                                String strNumber = String.valueOf(number);
                                for (int i = 0, j = strNumber.length() - 1; i < strNumber.length() / 2; i++, j--) {
                                    if (strNumber.charAt(i) != strNumber.charAt(j))
                                        return false;
                                }
                                return true;
                            };
                            if (performOperation.check(value))
                                System.out.println("PALINDROME");
                            else System.out.println("NOT PALINDROME");
                            break;
                    }
                }
        );
    }
}

interface PerformOperation {
    boolean check(int number);
}
