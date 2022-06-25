package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        List<String> tasks = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine())
            tasks.add(scanner.nextLine());

        //tasks.forEach(System.out::println);

        List<List<Integer>> resultList = new ArrayList<>();


        int n = Integer.parseInt(tasks.get(0));
        int q = n + 3;

        for (int i = 1; i <= n; i++) {
            String[] s = tasks.get(i).split(" ");
            if (s.length > 1){
                List<Integer> singleLine = new ArrayList<>();
                for (String s1 : s) {
                    singleLine.add(
                            Integer.parseInt(s1)
                    );
                }
                resultList.add(singleLine);
            } else {
                resultList.add(Collections.singletonList(0));
            }
        }

        for (int i = q; i < tasks.size(); i++) {
            String[] queries = tasks.get(i).split(" ");

            //System.out.println(tasks.get(i));

            int q1 = Integer.parseInt(queries[0]);
            int q2 = Integer.parseInt(queries[1]);

            try {
                System.out.println(resultList.get(q1-1).get(q2-1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }

}