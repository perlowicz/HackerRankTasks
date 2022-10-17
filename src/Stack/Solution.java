package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> examples = br.lines().toList();
        br.close();

        for (String example : examples) {
            char[] chars = example.toCharArray();
            Stack<Character> myStack = new Stack<>();
            boolean isOk = true;
            for (char singleChar : chars) {
                if (singleChar == '{' || singleChar == '[' ||
                    singleChar == '(')
                    myStack.push(singleChar);
                else if (!myStack.isEmpty())
                    myStack.pop();
                else {
                    isOk = false;
                    break;
                }
            }
            System.out.println(isOk && myStack.isEmpty());
        }
    }
}