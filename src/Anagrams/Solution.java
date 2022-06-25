package Anagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().toLowerCase();
        String b = scanner.nextLine().toLowerCase();

//        String a = "anagram";
//        String b = "margwqfgsana";

        List<Character> listOfA = new ArrayList<>();
        List<Character> listOfB = new ArrayList<>();

        if (a.length() != b.length()){
            System.out.println("Not Anagrams");
        } else {
            for (char c : a.toCharArray()) {
                listOfA.add(c);
            }
            for (char c : b.toCharArray()){
                listOfB.add(c);
            }

            Collections.sort(listOfA);
            Collections.sort(listOfB);

            System.out.println(
                    listOfA.equals(listOfB) ? "Anagrams" : "Not Anagrams"
            );
        }

    }
}
