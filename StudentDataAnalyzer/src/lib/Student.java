package lib;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Integer> grades;

    public Student(String name, int age, List<Integer> grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ") - Avg Grade: " + getAverageGrade();
    }
}
