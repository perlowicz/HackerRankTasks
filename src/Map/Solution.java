package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> myMap = new LinkedHashMap<>();

        while (n-- > 0){
            String name = scanner.nextLine();
            int number = Integer.parseInt(scanner.nextLine());
            myMap.put(name, number);
        }

        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (myMap.containsKey(s))
                System.out.println(s + "=" + myMap.get(s));
            else System.out.println("Not found");
        }
    }
}