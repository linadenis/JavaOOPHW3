public class Student extends Person {
    private int numberOfRecordBook;
    private int studentID;

    public Student(String name, String surname, int age, int numberOfRecordBook, int studentID) {
        super(name, surname, age);
        this.numberOfRecordBook = numberOfRecordBook;
        this.studentID = studentID;
    }

    public Student() {
    }

    public int getNumberOfRecordBook() {
        return numberOfRecordBook;
    }

    public void setNumberOfRecordBook(int numberOfRecordBook) {
        this.numberOfRecordBook = numberOfRecordBook;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberOfRecordBook=" + numberOfRecordBook +
                ", studentID=" + studentID + ", "
                + super.toString();
    }
}
