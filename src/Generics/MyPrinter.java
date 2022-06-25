package Generics;

import java.util.ArrayList;
import java.util.List;

class MyPrinter{


    public <E> void printList(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}
