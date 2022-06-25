package Sort;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        while (scanner.hasNextLine()){
            String[] s = scanner.nextLine().split(" ");
            studentList.add(
                    new Student(
                            Integer.parseInt(s[0]),
                            s[1],
                            Double.parseDouble(s[2])
                    )
            );
        }

        studentList.sort(
                (s1, s2) -> {
                    if (s2.getCGPA() != s1.getCGPA()){
                        return Double.compare(s2.getCGPA(), s1.getCGPA());
                    } else {
                        if (s2.getName().compareTo(s1.getName()) > 0)
                            return -1;
                        else return 1;
                    }
                }
        );

        studentList.forEach(System.out::println);
    }
}

class Student{
    private int Id;
    private String name;
    private double CGPA;

    public Student(int id, String name, double CGPA) {
        Id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String toString() {
        return name;
    }
}
