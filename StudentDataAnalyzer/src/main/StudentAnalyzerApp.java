package main;

import lib.Student;
import lib.StudentData;

import java.util.List;
import java.util.stream.Collectors;

public class StudentAnalyzerApp {
    public static void main(String[] args) {
        List<Student> students = StudentData.getSampleStudents();

        // 1. Filter students with an average grade above 80
        List<Student> highAchievers = students.stream()
                .filter(student -> student.getAverageGrade() > 80)
                .collect(Collectors.toList());
        System.out.println("High Achievers:");
        highAchievers.forEach(System.out::println);

        // 2. Collect student names into a comma-separated string
        String studentNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println("\nStudent Names: " + studentNames);

        // 3. Find the oldest student
        Student oldestStudent = students.stream()
                .max((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .orElse(null);
        System.out.println("\nOldest Student: " + oldestStudent);

        // 4. Parallel stream to print average grades (to demonstrate parallelism)
        System.out.println("\nParallel Stream - Average Grades:");
        students.parallelStream()
                .forEach(student -> System.out.println(student.getName() + ": " + student.getAverageGrade()));
    }
}