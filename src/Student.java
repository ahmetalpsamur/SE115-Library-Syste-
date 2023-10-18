import java.util.ArrayList;

public class Student {


    private int studentPassword;
    private int idNumber;
    private String studentUserName;


    public Student(){
    }

    public int getStudentNumber() {
        return idNumber;
    }

    public void setStudentUserName(String studentUserName) {this.studentUserName = studentUserName;}

    public void setStudentNumber(int studentNumber) {
        this.idNumber = studentNumber;
    }

    public int getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(int studentPassword) {
        this.studentPassword = studentPassword;
    }

    public int getIdNumber() {
        return idNumber-1;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
