package OOP;

public class Student extends Human {
    private int educationYear;
    public void setYear(int year) {
        this.educationYear = year;
    }

    public int getEducationYear() {
        return educationYear;
    }

    public void increaseEducationYear(){
        this.educationYear++;
    }
}
