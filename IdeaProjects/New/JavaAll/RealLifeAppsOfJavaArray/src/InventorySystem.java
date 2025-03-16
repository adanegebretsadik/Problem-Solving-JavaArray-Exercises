import java.util.Scanner;

public class InventorySystem {
    static String[] inventory  = {"Laptop","Phone", "Tablet", "Monitor", "Keyboard"};

    public static boolean isItemAvailable(String itemName){
        for (String item : inventory){
            if (item.equalsIgnoreCase(itemName)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the item to search:");
        String itemName = in.nextLine();

        if (isItemAvailable(itemName)){
            System.out.println("Item " + itemName + " is available on the stock");
        } else {
            System.out.println("Item " + itemName + " is not available on the stock");
        }
        in.close();
    }
}
