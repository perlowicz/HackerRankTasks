package MD5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HexFormat;

public class Solution {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg = br.readLine();

        br.close();

        byte[] msgBytes = msg.getBytes(StandardCharsets.UTF_8);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(msgBytes);
        byte[] digest = md5.digest();
        System.out.println(HexFormat.of().formatHex(digest));
    }
}
