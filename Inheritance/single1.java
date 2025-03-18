class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String displayInfo() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class Student extends Person {
    String studentId;
    String[] grades;

    public Student(String name, int age, String address, String studentId, String[] grades) {
        super(name, age, address);
        this.studentId = studentId;
        this.grades = grades;
    }

    public double calculateGPA() {
        int totalPoints = 0;
        for (String grade : grades) {
            switch (grade) {
                case "A": totalPoints += 4; break;
                case "B": totalPoints += 3; break;
                case "C": totalPoints += 2; break;
                case "D": totalPoints += 1; break;
            }
        }
        return totalPoints / (double) grades.length;
    }

  
    public String displayInfo() {
        return super.displayInfo() + ", Student ID: " + studentId + ", GPA: " + calculateGPA();
    }
}

public class Main {
    public static void main(String[] args) {
        String[] grades = {"A", "B", "A"};
        Student student = new Student("John Doe", 21, "1234 Elm St", "S1001", grades);
        System.out.println(student.displayInfo());
    }
}

