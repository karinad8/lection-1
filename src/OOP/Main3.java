package OOP;

public class Main3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setYear(2024);
        student.increaseEducationYear();
        System.out.println(student.getEducationYear());
    }
}
