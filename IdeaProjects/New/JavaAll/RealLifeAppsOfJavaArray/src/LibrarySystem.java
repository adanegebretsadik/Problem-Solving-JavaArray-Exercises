import java.util.Scanner;
public class LibrarySystem {
    public static void library(String[] n, Scanner in) {

        boolean found = false;
        String searchBook = in.nextLine().trim();

        for (String book: n){
            if (book.trim().equalsIgnoreCase(searchBook)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Book found in library");
        } else {
            System.out.println("Book not found in library");
        }

    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the book title to search: ");
        String[] books = {"java programming ", "Data structures", "Database systems", "Machine Learning", "Artifical Inteligence"};
        library(books,x);
        x.close();

    }
}
