package Students;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Ion",7);
        Student student2 = new Student("Adrian",9);
        Student student3 = new Student("Alex",5);

        System.out.println("Student 1: " + student1.getName() + ", Grade: " + student1.getGrade());
        System.out.println("Student 2: " + student2.getName() + ", Grade: " + student2.getGrade());
        System.out.println("Student 3: " + student3.getName() + ", Grade: " + student3.getGrade());
        System.out.println("Average Grade: " + Student.calculateAverageGrade());
    }
}
