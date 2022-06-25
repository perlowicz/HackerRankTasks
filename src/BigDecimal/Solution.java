package BigDecimal;

import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfValues = Integer.parseInt(scanner.nextLine());

        String[] arr = new String[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr, Collections.reverseOrder(
                (a1, a2) -> {
                    BigDecimal a = new BigDecimal(a1);
                    BigDecimal b = new BigDecimal(a2);
                    return a.compareTo(b);
                })
        );

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
