package Mandkind;

public class Student extends Human {
    private int faculty_number;
    public Student(String firstName, String lastName, int faculty_number) {
        super(firstName, lastName);
        this.faculty_number = faculty_number;
    }

    public int getFaculty_number() {
        return faculty_number;
    }

    public void setFaculty_number(int faculty_number) {
        this.faculty_number = faculty_number;
    }
}
