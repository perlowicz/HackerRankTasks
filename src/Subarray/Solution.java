package Subarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());

//        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        br.close();

        int[] arr = {1,-2,4,-5,1};

        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                negative += sum < 0 ? 1 : 0;
            }
        }
        System.out.println(negative);
//        int numberOfNegatives = 0;
//
//        numberOfNegatives += Arrays.stream(arr).sum() < 0 ? 1 : 0;
//
//        long count = Arrays.stream(arr)
//                .filter(a -> a < 0)
//                .count();
//
//        numberOfNegatives += count;
//
//        System.out.println(numberOfNegatives);
//
//       for (int i = 0; i < arr.length; i++){
//           if (arr[i] < 0) {
//               for (int j = arr.length; j > i; j--) {
//                   int[] tempInts = Arrays.copyOfRange(arr, i, j);
//                   if (tempInts.length > 1) {
//                       int tempSum = Arrays.stream(tempInts).sum();
//                       if (tempSum < 0) {
//                           numberOfNegatives++;
//                       }
//                   }
//               }
//               for (int j = 0; j < i; j++) {
//                   int[] tempInts = Arrays.copyOfRange(arr, j, i+1);
//                   if (tempInts.length > 1) {
//                       int tempSum = Arrays.stream(tempInts).sum();
//                       if (tempSum < 0) {
//                           numberOfNegatives++;
//                       }
//                   }
//               }
//           }
//       }
//        System.out.println(numberOfNegatives);
    }
}
