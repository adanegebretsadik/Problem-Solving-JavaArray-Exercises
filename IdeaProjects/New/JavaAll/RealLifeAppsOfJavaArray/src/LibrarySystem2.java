import java.util.Scanner;
public class LibrarySystem2 {
    static String[] books = {"The alchemist", "1984", "to kill a Mockingbird", "The great gatsby", "Moby Dick"};
    static boolean[] isBorrowed = new boolean[books.length];

    public static void displayBooks() {
        System.out.println("\nAvailable books:");
        for (int i = 0; i < books.length; i++) {
            if (!isBorrowed[i]) {
                System.out.println((i+1)+". "+books[i]);
            }
        }
    }
    public static void borrowBook(Scanner in) {
        displayBooks();
        System.out.println("\nEnter the number of the book you want to borrow:");
        int numBooks = in.nextInt();

        if (numBooks < 1 || numBooks > books.length || isBorrowed[numBooks-1]) {
            System.out.println("X Invalid selection or book is already borrowed.");
        } else {
            isBorrowed[numBooks-1] = true;
            System.out.println("you borrowed "+books[numBooks-1]);
        }
    }
    public static void returnBook(Scanner in) {
        System.out.println("\nBorrowed book:");
        boolean hasBorrowed = false;
        for (int i = 0; i < books.length; i++) {
            if (isBorrowed[i]) {
                System.out.println((i+1)+". "+books[i]);
                hasBorrowed = true;
            }
        }
        if (!hasBorrowed) {
            System.out.println("No books are currently borrowed.");
            return;
        }
        System.out.println("\nEnter the number of the book you want to return:");
        int numBooks = in.nextInt();


        if (numBooks < 1 || numBooks > books.length || !isBorrowed[numBooks-1]) {
            System.out.println("X Invalid selection or book was not borrowed.");
        } else {
            isBorrowed[numBooks-1] = false;
            System.out.println("you returned "+books[numBooks-1]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n Library Menu");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = in.nextInt();
            
            switch(choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    borrowBook(in);
                    break;
                case 3:
                    returnBook(in);
                    break;
                case 4:
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                 default:
                     System.out.println("Invalid choice. Try again.");
            }
        } while(choice != 4);

        in.close();
    }
}
