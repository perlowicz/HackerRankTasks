package Primality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        br.close();

        BigInteger value = new BigInteger(n);
        System.out.println(value.isProbablePrime(100) ? "prime" : "not prime");
    }
}
