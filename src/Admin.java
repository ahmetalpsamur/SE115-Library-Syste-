import java.util.ArrayList;

public class Admin  {

    private String userName;
    private int password;

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Academician> academicianList = new ArrayList<>();

    public void printBookList(){
        int i=0;
        while (i < bookList.size()){
            System.out.println((i+1) + "- Name:" + bookList.get(i).getBookName() + ", Author:" + bookList.get(i).getAuthor() + ", Pages:" + bookList.get(i).getPage() + ", Genre:" + bookList.get(i).getGenre() +  ", Available:" + bookList.get(i).isBorrowed() );
            i++;
        }
    }

    public void registerAStudent(int userNumber, String name, int password){
        Student newStudent = new Student();
        newStudent.setIdNumber(userNumber);
        newStudent.setStudentPassword(password);
        newStudent.setStudentUserName(userName);
        studentList.add(newStudent);
        newStudent.setStudentNumber(newStudent.getStudentNumber()+1);
    }

    public void addANewBook(String bookName, int page, String author, String genre, boolean isBorrowed){
        Book newBook = new Book();
        newBook.setAuthor(author);
        newBook.setBookName(bookName);
        newBook.setPage(page);
        newBook.setGenre(genre);
        newBook.setBorrowed(isBorrowed);
        bookList.add(newBook);
    }

    public void registerAAcademician(int userNumber, String name, int password){
        Academician newAcademician = new Academician();
        academicianList.add(newAcademician);
        newAcademician.setAcademicianNumber(userNumber);
        newAcademician.setAcademicianUserName(name);
        newAcademician.setAcademicianPassword(password);
        userNumber++;
    }

    public void deleteAStudent(int idNumber){
        int i=0;
        while (i < studentList.size()){
            if (studentList.get(i).getIdNumber() == idNumber){
                studentList.remove(i);
                break;
            }
            i++;
        }
    }

    public void deleteAAcademician(int idNumber){
        academicianList.remove(idNumber);
    }

    public void deleteABook(int bookIndex){
        bookList.remove(bookIndex);
    }

    public void printNumberOfBooks(){
        System.out.println(bookList.size()+ " book exists in our library.");
    }

    public void printNumberOfStudents(){
        System.out.println(studentList.size() + " student accounts exists.");
    }

    public void printNumberOfAcademicians(){
        System.out.println(academicianList.size() + " academician accounts exists.");
    }

    public void printUserNumber(){
        System.out.println(academicianList.size() + studentList.size() + " total user exists.");
    }


    public int getPassword() {
        return password;
    }

    public void returnABook(int bookIndex){
        bookList.get(bookIndex).setBorrowed(true);
    }

    public void lendABook(int bookIndex){
        bookList.get(bookIndex).setBorrowed(false);
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public void setName(String name) {
        this.userName = name;
    }

    public String getName() {
        return userName;
    }

}
