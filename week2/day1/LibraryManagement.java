package week2.day1;

public class LibraryManagement {

    public static void main(String[] args) {
        Library lib = new Library();

        
        String title = lib.addBook("Data Structures");
        System.out.println("Returned Book Title: " + title);

        lib.issueBook();
    }
}
