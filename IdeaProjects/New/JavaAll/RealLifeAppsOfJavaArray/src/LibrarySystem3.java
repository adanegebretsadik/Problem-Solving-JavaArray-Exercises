import java.util.Scanner;
public class LibrarySystem3 {

    static String[] books = {"chemistry", "math", "physics", "engineering", "science"};

    public static void displayBooks() {
        System.out.println("\nAvailable books:");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    public static void searchBooks(Scanner in) {
        System.out.println("\nEnter the name of the book you wish to search: ");
        String bookName = in.nextLine();

        if (isBookFound(bookName)){
            System.out.println("Book found: " + bookName);
        } else {
            System.out.println("Book not found: " + bookName);
        }
    }
    public static boolean isBookFound(String bookName) {
        for (String book : books) {
            if (book.equalsIgnoreCase(bookName)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Display Books");
            System.out.println("2. Search Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    searchBooks(in);
                    break;
                case 3:
                    System.out.println("Goodbye!");

                    in.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
                    
                    

            }

        }

    }

}
