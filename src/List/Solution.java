package List;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> operations = List.of(
                "50",
                "75192 14885 71431 34461 61231 21558 55622 36011 39791 94414 37813 30293 64822 11691 19285 98683 8562 6953 82718 63941 69534 35738 45068 95556 11046 85063 30936 11640 56380 65304 87804 60980 38266 10904 43475 26649 92856 90700 54044 2437 88357 17442 73368 39722 15320 14133 47254 69024 5565 95080",
                "100",
                "Insert",
                "44 30237",
                "Insert",
                "34 57126",
                "Insert",
                "33 5418",
                "Insert",
                "30 66954",
                "Delete",
                "13",
                "Insert",
                "4 38588",
                "Insert",
                "38 28360",
                "Insert",
                "24 23895",
                "Insert{-truncated-}"
        );
//        List<String> operations = br.lines().collect(Collectors.toList());

        int sizeOfList = Integer.parseInt(operations.get(0));

        String[] s = operations.get(1).split(" ");
        for (String s1 : s) {
            list.add(Integer.parseInt(s1));
        }

        for (int i = 3; i < operations.size() - 1; i++) {
            System.out.println("Size: " + list.size());
            if (operations.get(i).equals("Insert")){
                System.out.println("Inserting: " + operations.get(i + 1));
                String[] s1 = operations.get(i + 1).split(" ");
                if (list.size() < sizeOfList) {
                    list.add(
                            Integer.parseInt(s1[0]),
                            Integer.parseInt(s1[1])
                    );
                }
            } else if (operations.get(i).equals("Delete")){
                System.out.println("Deleting: " + operations.get(i + 1));
                list.remove(Integer.parseInt(operations.get(i + 1)));
            }
        }

        list.forEach(e -> System.out.print(e + " "));
    }
}
