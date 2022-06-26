package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        AdvancedArithmetic advancedArithmetic = n1 -> {
            List<Integer> divisiors = new ArrayList<>();
            for (int i = 1; i < n1; i++) {
                if (n1 % i == 0)
                    divisiors.add(i);
            }
            int result = n1;
            for (Integer divisior : divisiors) {
                result += divisior;
            }
            return result;
        };

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(advancedArithmetic.divisor_sum(n));
    }
}
interface AdvancedArithmetic{
    int divisor_sum(int n);
}