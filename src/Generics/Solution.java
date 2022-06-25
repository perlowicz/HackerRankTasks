package Generics;

import java.util.Scanner;

public class Solution<T> {

    public static void main(String[] args) {
        Integer[] ints= {1,2,3};
        String[] strings = {"Hello", "World"};

        MyPrinter firstPrinter = new MyPrinter();

        firstPrinter.printList(ints);
        firstPrinter.printList(strings);
    }
}
