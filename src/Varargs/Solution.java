package Varargs;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Add{

    static void add(int... args){
        int sum = IntStream.of(args).sum();
        String finalDesc = IntStream.of(args)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining("+")) + "=" + sum;
        System.out.println(finalDesc);
    }
}


public class Solution {

    public static void main(String[] args) throws IOException {
        int n = 6;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputs.add(Integer.parseInt(br.readLine()));
        }
        inputs.forEach(Add::add);
    }
}


