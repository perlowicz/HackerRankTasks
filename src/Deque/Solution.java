package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        int M = Integer.parseInt(firstLine.split(" ")[1]);
        String[] lines = br.readLine().split(" ");

        List<Integer> elements = new ArrayList<>();

        for (String line : lines)
            elements.add(Integer.parseInt(line));

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> mySet = new HashSet<>();

        int maxSubarraySize = Integer.MIN_VALUE;

        for (int i = 0; i < elements.size(); i++) {
            deque.add(elements.get(i));
            mySet.add(elements.get(i));


            if (i >= M){
                maxSubarraySize = Math.max(maxSubarraySize, mySet.size());
                int poll = deque.poll();
                if (!deque.contains(poll))
                    mySet.remove(poll);
            }

        }

        System.out.println(maxSubarraySize);
    }
}
