package lib;

import java.util.Arrays;
import java.util.List;

public class StudentData {
    public static List<Student> getSampleStudents() {
        return Arrays.asList(
            new Student("Alice", 20, Arrays.asList(85, 90, 78)),
            new Student("Bob", 22, Arrays.asList(70, 88, 91)),
            new Student("Charlie", 19, Arrays.asList(95, 92, 89)),
            new Student("Diana", 21, Arrays.asList(60, 75, 68)),
            new Student("Eve", 23, Arrays.asList(88, 85, 91))
        );
    }
}