package Substring;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int k = in.nextInt();
        System.out.println(getSmallestAndLargest(word, k));
    }

    private static String getSmallestAndLargest(String s, int k){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (i >= (k - 1)){
                list.add(s.substring((i - (k - 1)), (i+1)));
            }
        }
        Collections.sort(list);
        return list.get(0) + "\n" + list.get(list.size()-1);
    }
}
