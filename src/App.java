import java.util.Scanner;

public class App {

    public static void main(String[] args) {



        Admin admin = new Admin();

        admin.setName("A");
        admin.setPassword(100);
        Scanner scanner = new Scanner(System.in);
        String WhoAreYou = "NoOne";

        //Admin Login Information//
        String AdminUsername = "admin";
        String AdminPassword = "admin";

        admin.registerAStudent(5, "A", 100);
        admin.registerAStudent(8, "B", 104);
        admin.registerAStudent(11, "C", 102);
        admin.registerAStudent(7, "D", 103);
        admin.registerAAcademician(1, "A", 100);
        admin.registerAAcademician(2, "B", 101);
        admin.registerAAcademician(3, "C", 102);
        admin.registerAAcademician(4, "D", 103);

        admin.addANewBook("Kafka On The Shore", 653, "Haruki Murakami", "Fantastic Novel", true);
        admin.addANewBook("Game of Thrones", 847, "George R.R. Martin", "Fantastic Novel", true);
        admin.addANewBook("1984", 352, "George Orwell", "Dystopia", true);
        admin.addANewBook("Metamorphosis", 80, "Franz Kafka", "Psychological novel", true);
        admin.addANewBook("Lord of The Rings : The Fellowship of the Ring", 423, "J. R. R. Tolkien", "Fantastic Novel", true);
        admin.addANewBook("Lord of The Rings : The Two Tower", 352, "J. R. R. Tolkien", "Fantastic Novel", true);
        admin.addANewBook("Lord of The Rings : The Return of The King", 416, "J. R. R. Tolkien", "Fantastic Novel", true);
        admin.addANewBook("The Royal Game", 85, "Stefan Zweig", "Psychological Novel", true);
        admin.addANewBook("Rachel Arraigns with God", 50, "Stefan Zweig", "Religion Novel", true);
        admin.addANewBook("Sapiens: A Brief History of Humankind", 450, "Yuval Noah Harari", "History", true);


        //LOGIN PART//
        System.out.println("\n" +
                "██╗███████╗██╗░░░██╗  ██╗░░░░░██╗██████╗░██████╗░░█████╗░██████╗░██╗░░░██╗\n" +
                "██║██╔════╝██║░░░██║  ██║░░░░░██║██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗░██╔╝\n" +
                "██║█████╗░░██║░░░██║  ██║░░░░░██║██████╦╝██████╔╝███████║██████╔╝░╚████╔╝░\n" +
                "██║██╔══╝░░██║░░░██║  ██║░░░░░██║██╔══██╗██╔══██╗██╔══██║██╔══██╗░░╚██╔╝░░\n" +
                "██║███████╗╚██████╔╝  ███████╗██║██████╦╝██║░░██║██║░░██║██║░░██║░░░██║░░░\n" +
                "╚═╝╚══════╝░╚═════╝░  ╚══════╝╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░");
        //LOGIN PART//
        while (true) {
            System.out.println("Welcome to IEU Library System.");
            System.out.println("1-) Student\t2-) Admin\t3-) Academician\t4-)Quit ");
            int studentOrStaff = scanner.nextInt();
            //Student PART//
            if (studentOrStaff == 1) {
                while (true) {
                    System.out.println("Sign in or Register ");
                    System.out.println("1-Login \t 2-) Register \t 3-)Back");
                    int choice1 = scanner.nextInt();

                    //Student Login PART//
                    if (choice1 == 1) {
                        boolean trueOrFalse = true;
                        while (trueOrFalse){
                            System.out.print("Enter your ID number:");
                            int idNumber = scanner.nextInt();
                            System.out.print("Enter your password:");
                            int password = scanner.nextInt();
                            int i=0;

                            while (i < admin.studentList.size()){
                                if (admin.studentList.get(i).getIdNumber() == idNumber && admin.studentList.get(i).getStudentPassword() == password){
                                    System.out.println("Entry successful.");
                                    trueOrFalse = false;
                                }
                                i++;
                            }

                        }
                        WhoAreYou = "Student";
                        break;

                    }
                    //Student Register PART//
                    else if (choice1 == 2) {
                        scanner.nextLine();
                        System.out.println("Register");
                        System.out.println("Enter a Username");
                        String User = scanner.next();
                        System.out.println("Enter a Password");
                        String Password = scanner.next();
                        System.out.println("Successful");

                        System.out.println("User name");
                        String LoginUser = scanner.next();
                        System.out.println("Password:");
                        String LoginPassword = scanner.next();

                        if (LoginPassword.equals(Password) && LoginUser.equals(User)) {
                            System.out.println("Success");
                            WhoAreYou = "Student";
                            break;


                        } else {
                            System.out.println("Fail");
                        }

                    }
                    //Student Back PART//
                    else if (choice1 == 3) {
                        break;
                    }
                    //Student Wrong Number PART//
                    else {
                        System.out.println("You entered wrong number.");
                    }

                }
            }

            //Admin PART//
            else if (studentOrStaff == 2) {
                while (true) {
                    System.out.println("Note:If you don't know your Admin Login.Please contact IEU Services.");
                    System.out.println("1-) Login\t2-)Back");
                    int AdminLoginOrBackChoice = scanner.nextInt();
                    //Admin LOGIN PART//
                    if (AdminLoginOrBackChoice == 1) {
                        scanner.nextLine();
                        System.out.println("Enter Admin Username: ");
                        String AdminLoginUsername = scanner.nextLine();
                        System.out.println("Enter Admin Password: ");
                        String AdminLoginPassword = scanner.nextLine();
                        if (AdminLoginUsername.equals(AdminUsername) && AdminLoginPassword.equals(AdminPassword)) {
                            System.out.println("Your Login Sucessfull!");
                            WhoAreYou = "Admin";
                            break;
                        } else {
                            System.out.println("Failed.");
                        }


                    }
                    //Admin BACK PART//
                    else if (AdminLoginOrBackChoice == 2) {
                        break;
                    }
                    //Admin WRONG NUMBER PART//
                    else {
                        System.out.println("You Entered Wrong Number");
                    }


                }

            }


            //Academician PART//
            else if (studentOrStaff == 3) {
                while (true) {
                    System.out.println("Sign in or Back ");
                    System.out.println("1-Login \t2-)Back");
                    int choice3 = scanner.nextInt();
                    //Academician Login PART//
                    if (choice3 == 1) {
                        boolean trueOrFalse = true;
                        while (trueOrFalse){
                            System.out.print("Enter your ID number:");
                            int idNumber = scanner.nextInt();
                            System.out.print("Enter your password:");
                            int password = scanner.nextInt();
                            int i=0;

                            while (i < admin.academicianList.size()){
                                if (admin.academicianList.get(i).getAcademicianIDNumber() == idNumber && admin.academicianList.get(i).getAcademicianPassword() == password){
                                    System.out.println("Entry successful.");
                                    trueOrFalse = false;
                                }
                                i++;
                            }

                        }
                        WhoAreYou = "Academician";
                        break;


                    }
                    //Academician Back PART//
                    else if (choice3 == 2) {
                        System.out.println("Back...");
                        WhoAreYou="NoOne";


                        break;
                    }
                }
            }


            //QUIT PART//
            else if (studentOrStaff == 4) {
                break;

            }


            //Wrong Number PART//
            else {
                System.out.println("You Entered Wrong Number");
            }


            //Student Method Part//
            if (WhoAreYou.equals("Student")) {
                while (true) {
                    System.out.println("\n1-)Print Book List\n2-)Return a Book\n3-)Borrow a Book\n4-)Exit Your Account And Back Login Part");
                    int StudentMethodChoice = scanner.nextInt();
                    //Student Method Print Book Part//
                    if (StudentMethodChoice == 1) {
                        for (int BookListCounter = 0; BookListCounter < admin.bookList.size(); BookListCounter++) {
                            System.out.println((BookListCounter + 1) + "-) " + admin.bookList.get(BookListCounter).getBookName() + "\tAuthor: " + admin.bookList.get(BookListCounter).getAuthor() +"  Genre: "+admin.bookList.get(BookListCounter).getGenre()+ "\t\tAvailable:" + admin.bookList.get(BookListCounter).isBorrowed());
                        }
                    }
                    //Student Method Return Book Part//
                    else if (StudentMethodChoice == 2) {
                        System.out.println("\n\n\n");
                        System.out.println("Choose Your Return your Book.\nNote: It have to be FALSE.");
                        for (int BookListCounter = 0; BookListCounter < admin.bookList.size(); BookListCounter++) {

                            System.out.println((BookListCounter + 1) + "-) " + admin.bookList.get(BookListCounter).getBookName() + "\t\tAvailable:" + admin.bookList.get(BookListCounter).isBorrowed());
                        }
                        int StudentChooseBook = scanner.nextInt();
                        if (admin.bookList.get(StudentChooseBook - 1).isBorrowed() == false) {
                            System.out.println("You returned your  " + admin.bookList.get(StudentChooseBook - 1).getBookName());
                            admin.bookList.get(StudentChooseBook - 1).setBorrowed(true);
                        } else {
                            System.out.println("\n\n\n");
                            System.out.println("You Entered Wrong Number Or This book avaible...");
                        }

                    }
                    //Student Method Borrowed Part//
                    else if (StudentMethodChoice == 3) {
                        System.out.println("\n\n\n");
                        System.out.println("Choose Your Book.\nNote: It have to be TRUE.");
                        for (int BookListCounter = 0; BookListCounter < admin.bookList.size(); BookListCounter++) {

                            System.out.println((BookListCounter + 1) + "-) " + admin.bookList.get(BookListCounter).getBookName() + "\t\tAvailable:" + admin.bookList.get(BookListCounter).isBorrowed());
                        }
                        int StudentChooseBook = scanner.nextInt();
                        if (admin.bookList.get(StudentChooseBook - 1).isBorrowed() == true) {
                            System.out.println("You can borrow " + admin.bookList.get(StudentChooseBook - 1).getBookName());
                            admin.bookList.get(StudentChooseBook - 1).setBorrowed(false);
                        } else {
                            System.out.println("\n\n\n");
                            System.out.println("You Entered Wrong Number Or This book borrowed once...");
                        }

                    }
                    //Student Method Exit Part//
                    else if (StudentMethodChoice == 4) {
                        WhoAreYou = "NoOne";
                        break;
                    }
                    //Student Method Wrong Number Part//
                    else {
                        System.out.println("You Entered Wrong Number!");
                    }


                }

            }


            //Admin Method Part//
            else if (WhoAreYou.equals("Admin")) {
                int choice;
                do {
                    printAdminMenu();
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter a name:");
                            String studentName = scanner.next();
                            System.out.print("Enter an id number:");
                            int studentIDNumber = scanner.nextInt();
                            System.out.print("Enter a password:");
                            int studentPassword = scanner.nextInt();
                            admin.registerAStudent(studentIDNumber, studentName, studentPassword);
                            break;


                        case 2:
                            System.out.print("Enter a name:");
                            String academicianName = scanner.next();
                            System.out.print("Enter an id number:");
                            int academicianIDNumber = scanner.nextInt();
                            System.out.print("Enter a password:");
                            int academicianPassword = scanner.nextInt();
                            admin.registerAAcademician(academicianIDNumber,academicianName, academicianPassword);
                            break;

                        case 3:
                            System.out.print("Enter the student's ID number you want to delete:");
                            int idOfTheStudentToBeDeleted = scanner.nextInt();
                            admin.deleteAStudent(idOfTheStudentToBeDeleted);
                            break;

                        case 4:
                            System.out.print("Enter the academician's ID number you want to delete:");
                            int idOfTheAcademicianToBeDeleted = scanner.nextInt();
                            admin.deleteAAcademician(idOfTheAcademicianToBeDeleted);
                            break;

                        case 5:
                            System.out.print("Enter the book name:");
                            String bookName = scanner.next();
                            System.out.print("Enter page number:");
                            int bookPageNumber = scanner.nextInt();
                            System.out.print("Enter the author's name:");
                            String authorsName = scanner.next();
                            System.out.print("Enter the genre:");
                            String genre = scanner.next();
                            admin.addANewBook(bookName, bookPageNumber, authorsName, genre, true);
                            break;

                        case 6:
                            System.out.print("The book number you want to delete:");
                            int indexOfBookToBeDeleted = scanner.nextInt();
                            admin.deleteABook(indexOfBookToBeDeleted);
                            break;

                        case 7:
                            admin.printBookList();

                        case 8:
                            admin.printNumberOfBooks();
                            break;

                        case 9:
                            admin.printNumberOfStudents();
                            break;

                        case 10:
                            admin.printNumberOfAcademicians();
                            break;

                        case 11:
                            admin.printUserNumber();
                            break;

                        case 12:
                            admin.printBookList();
                            System.out.print("Enter the book index you want to lend:");
                            int bookIndex1 = scanner.nextInt();
                            admin.lendABook(bookIndex1-1);
                            break;

                        case 13:
                            admin.printBookList();
                            System.out.print("Enter the book index you want to take back:");
                            int bookIndex2 = scanner.nextInt();
                            admin.returnABook(bookIndex2-1);
                            break;

                        case 14:
                            System.out.println("Exiting the program...");
                            WhoAreYou="NoOne";
                            break;

                        default:
                            System.out.println("You entered invalid number.");

                    }
                }while (choice != 14);
            }


            //Academician Method Part//
            if (WhoAreYou.equals("Academician")) {
                while (true) {
                    System.out.println("\n1-)Print Book List\n2-)Return a Book\n3-)Borrow a Book\n4-)Exit Your Account And Back Login Part");
                    int AcademicianMethodChoice = scanner.nextInt();
                    if (AcademicianMethodChoice == 1) {
                        for (int BookListCounter = 0; BookListCounter < admin.bookList.size(); BookListCounter++) {
                            System.out.println((BookListCounter + 1) + "-) " + admin.bookList.get(BookListCounter).getBookName() + "\tAuthor: " + admin.bookList.get(BookListCounter).getAuthor() + "\t\tAvailable:" + admin.bookList.get(BookListCounter).isBorrowed());
                        }
                    }
                    //Academician Borrowed Part//
                    else if (AcademicianMethodChoice == 3) {
                        System.out.println("\n\n\n");
                        System.out.println("Choose Your Book.\nNote: It have to be TRUE.");
                        for (int BookListCounter = 0; BookListCounter < admin.bookList.size(); BookListCounter++) {

                            System.out.println((BookListCounter + 1) + "-) " + admin.bookList.get(BookListCounter).getBookName() + "\t\tAvailable:" + admin.bookList.get(BookListCounter).isBorrowed());
                        }
                        int AcademicianChooseBook = scanner.nextInt();
                        if (admin.bookList.get(AcademicianChooseBook - 1).isBorrowed() == true) {
                            System.out.println("You can borrow " + admin.bookList.get(AcademicianChooseBook - 1).getBookName());
                            admin.bookList.get(AcademicianChooseBook - 1).setBorrowed(false);
                        } else {
                            System.out.println("\n\n\n");
                            System.out.println("You Entered Wrong Number Or This book borrowed once...");
                        }
                    }
                    //Academician Returned Part//
                    else if (AcademicianMethodChoice == 2) {
                        System.out.println("\n\n\n");
                        System.out.println("Choose Your Return your Book.\nNote: It have to be FALSE.");
                        for (int BookListCounter = 0; BookListCounter < admin.bookList.size(); BookListCounter++) {

                            System.out.println((BookListCounter + 1) + "-) " + admin.bookList.get(BookListCounter).getBookName() + "\t\tAvailable:" + admin.bookList.get(BookListCounter).isBorrowed());
                        }
                        int AcademicianChooseBook = scanner.nextInt();
                        if (admin.bookList.get(AcademicianChooseBook - 1).isBorrowed() == false) {
                            System.out.println("You returned your  " + admin.bookList.get(AcademicianChooseBook - 1).getBookName());
                            admin.bookList.get(AcademicianChooseBook - 1).setBorrowed(true);
                        } else {
                            System.out.println("\n\n\n");
                            System.out.println("You Entered Wrong Number Or This book available...");
                        }
                    }
                    //Academician Back Part//
                    else if (AcademicianMethodChoice == 4) {
                        System.out.println("Back and Logout...");
                        break;
                    }
                    //Academician Wrong Number Part//
                    else {
                        System.out.println("You Entered Wrong Number!");
                    }
                }
            }
        }
    }

    public static void printAdminMenu() {
        System.out.println("Options:");
        System.out.println("1-  Register a new student.");
        System.out.println("2-  Register a new academician");
        System.out.println("3-  Delete a student.");
        System.out.println("4-  Delete a academician.");
        System.out.println("5-  Add a new book to the library.");
        System.out.println("6-  Delete a book from the library.");
        System.out.println("7-  Print the book list.");
        System.out.println("8-  Print total number of books.");
        System.out.println("9-  Print student user number.");
        System.out.println("10- Print academician user number");
        System.out.println("11- Print total number of users.");
        System.out.println("12- Lend a book to a user.");
        System.out.println("13- Take a book back from a user.");
        System.out.println("14- Go back to login part.");
    }
}