public class Academician  {

    private int academicianIDNumber;
    private String academicianUserName;
    private int academicianPassword;
    private int academicianNumber =0;

    public Academician(int academicianUserNumber, String academicianUserName, int academicianPassword) {
        this.academicianIDNumber = academicianUserNumber;
        this.academicianUserName = academicianUserName;
        this.academicianPassword = academicianPassword;
    }

    public Academician(){

    }

    public int getAcademicianIDNumber() {
        return academicianIDNumber+1;
    }


    public String getAcademicianUserName() {
        return academicianUserName;
    }

    public void setAcademicianUserName(String academicianUserName) {
        this.academicianUserName = academicianUserName;
    }

    public int getAcademicianPassword() {
        return academicianPassword;
    }

    public void setAcademicianPassword(int academicianPassword) {
        this.academicianPassword = academicianPassword;
    }

    public int getAcademicianNumber() {
        return academicianNumber;}

    public void setAcademicianNumber(int academicianNumber) {
        this.academicianNumber = academicianNumber;
    }
}
