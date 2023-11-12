package Students;

public class Student {
    private final String name;
    private final int grade;

    private static int totalGrades = 0;
    private static int numberOfStudents = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        numberOfStudents++;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public static double calculateAverageGrade() {
        if (numberOfStudents == 0) {
            return 0; // Avoid division by zero
        }

        return (double) totalGrades / numberOfStudents;
    }
}
