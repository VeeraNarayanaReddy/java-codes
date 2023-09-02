package coding3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 20, 85.5));
        studentList.add(new Student("Bob", 19, 92.0));
        studentList.add(new Student("Charlie", 21, 78.3));
        studentList.add(new Student("David", 18, 65.7));

        // Sort by age in descending order
        Collections.sort(studentList, Comparator.comparingInt(Student::getAge).reversed());
        System.out.println("Sorted by Age (descending):");
        printStudentList(studentList);

        // Sort by name
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        System.out.println("\nSorted by Name:");
        printStudentList(studentList);

        // Sort by grade
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade));
        System.out.println("\nSorted by Grade:");
        printStudentList(studentList);
    }

    public static void printStudentList(List<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Grade: " + student.getGrade());
        }
    }
}
