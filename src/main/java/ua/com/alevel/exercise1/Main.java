package ua.com.alevel.exercise1;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[9];
        students[0] = new Student("Ivan", "Ivanov", "A123", 5.0);
        students[1] = new Aspirant("Emily", "Smith", "B456", 4.0, "Research on AI");
        students[2] = new Student("Michael", "Johnson", "A123", 4.8);
        students[3] = new Aspirant("Jessica", "Williams", "B456", 4.2, "Research on AI");
        students[4] = new Student("David", "Brown", "A123", 5.0);
        students[5] = new Aspirant("Sarah", "Garcia", "B456", 4.9, "Research on AI");
        students[6] = new Student("Christopher", "Davis", "A123", 4.8);
        students[7] = new Aspirant("Elizabeth", "Rodriguez", "B456", 5.0, "Research on AI");
        students[8] = new Aspirant("Petr", "Petrov", "B456", 5.0, "Research on AI");

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }

    }

}