package Java_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class question7 {
    public static void main(String[] args) {
        // Goal: You have a list of Student objects. Find the student(s) with the highest grade
        // and print their information. If multiple students have the same highest grade,
        // print all of them.
        //
        // Steps:
        //   1. A list of Student objects is already given to you.
        //   2. Find the maximum grade among all students and assign it to the variable highestGrade.
        //   3. Collect all students who have this maximum grade and assign them to the list topStudents.
        //   4. The highestGrade and topStudents list are printed automatically.

        List<Student> students = generateStudents(6);
        double highestGrade = 0.0;
        List<Student> topStudents = new ArrayList<>();

        // Your code here ↓↓↓↓




        // ↑↑↑↑ Your code goes above

        System.out.println("Question 7 - Top Students");
        System.out.println("    Students: " + students);
        System.out.println("    Highest Grade: " + highestGrade);
        System.out.println("    Top Student(s): " + topStudents);

    }

    private static List<Student> generateStudents(int count) {
        List<Student> students = new ArrayList<>();
        String[] names = {"Ayush", "Bob", "Chitra", "Divya", "Eve", "Frank", "Gaurav", "Hitesh"};
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            // Loop back to the first name if count > names.length
            String name = names[i % names.length];
            double grade = Math.round((random.nextDouble() * 40 + 60) * 10.0) / 10.0; // Grades 60-100
            students.add(new Student(name, grade));
        }
        return students;
    }
}

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}
