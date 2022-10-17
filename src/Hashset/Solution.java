package Hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String line = "";
        HashSet<String> mySet = new HashSet<>();
        while ((line = br.readLine()) != null){
            mySet.add(line);
            System.out.println(mySet.size());
        }
    }
}