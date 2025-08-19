import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    private String studentId;
    private String name;
    private int age;
    private String course;

    public Student(String studentId, String name, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
class CollegeManagement {
    private List<Student> students;

    public CollegeManagement() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out.println("--- All Student Details ---");
        for (Student student : students) {
            student.displayStudentDetails();
            System.out.println("-------------------------");
        }
    }
    public void removeStudent(String studentId) {
        Student studentToRemove = findStudentById(studentId);
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student with ID " + studentId + " removed successfully.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
    public static void main(String[] args) {
        CollegeManagement college = new CollegeManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add a new student");
            System.out.println("2. Find student by ID");
            System.out.println("3. Display all students");
            System.out.println("4. Remove a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: