import java.util.Scanner;
public class GroceryList {
    public static String[] inputGroceries(Scanner in, int n){
        String[] groceries = new String[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter the grocery item" + (i+1)+ ":");
            groceries[i] = in.nextLine();
        }
        return groceries;
    }
    public static void displayGroceries(String[] groceries){
        System.out.println("\nYour Shopping List:");
        for (String item : groceries){
            System.out.println("- " + item);

            }
        }
    public static void searchItem(String[] groceries, String searchItem){
        boolean found = false;
        for (String item : groceries){
            if (item.equalsIgnoreCase(searchItem)){
                found = true;
                break;
        }

    }
        if (found){
            System.out.println(searchItem + "is in your shopping list.");
        } else {
            System.out.println(searchItem + "is NOT in your Shopping list.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of grocery items: ");
        int x = in.nextInt();
        in.nextLine();

        String[] groceries = inputGroceries(in, x);
        displayGroceries(groceries);

        System.out.println("\nEnter an Item to search: ");
        String searchItem = in.nextLine();
        searchItem(groceries, searchItem);
        in.close();
    }
}
