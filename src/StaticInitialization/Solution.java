package StaticInitialization;

import java.io.BufferedReader;
import java.util.Scanner;

public class Solution {

    static int H;
    static int B;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        flag = B > 0 && H > 0;

        if (!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
