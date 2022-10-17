package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        List<String> examples = br.lines().collect(Collectors.toList());
//        br.close();

        List<String> examples = List.of(
                "({}[])",
                "(({()})))",
                "({(){}()})()({(){}()})(){()}",
                "{}()))(()()({}}{}",
                "}}}}",
                "))))",
                "{{{",
                "(((",
                "[]{}(){()}((())){{{}}}{()()}{{}{}}",
                "[[]][][]",
                "}{"
        );

//        List<String> examples = List.of("}}}}");

        readloop:
        for (String example : examples) {
            char[] chars = example.toCharArray();
            MyStack myStack = new MyStack(chars.length);
            for (char singleChar : chars) {
                try {
                    if (singleChar == '{' || singleChar == '(' ||
                        singleChar == '[')
                        myStack.push(singleChar);
                    else myStack.pop();
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("false");
                }
            }
            System.out.println(myStack.size() == 0 ? "true" : "false");
        }
    }
}

class MyStack {
    private char[] arr;
    public int top;
    private int capacity;
    MyStack(int size){
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    void push(char x){
        arr[++top] = x;
    }

    char pop(){
        peek();
        return arr[top--];
    }

    char peek(){
        if (!isEmpty())
            return arr[top];
        return '1';
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size(){
        return top + 1;
    }

    public String toString(){
        return Arrays.toString(arr);
    }
}