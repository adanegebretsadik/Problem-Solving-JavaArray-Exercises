import java.util.Scanner;

public class AirlineReservation {
    public static void bookSeat(int[] seats, int seatNumber){
        if (seatNumber < 1 || seatNumber > 10){
            System.out.println("Invalid seat number. Try again.");
            return;
        }
        if (seats[seatNumber-1] == 2){
            System.out.println("seat "+ seatNumber+" is already booked.");
        } else {
            seats[seatNumber-1] = 2;
            System.out.println("seat "+ seatNumber+" is booked successfully.");
        }
    }
    public static void displayAvailableSeats(int[] seats){
        System.out.println("Available seats: ");

        for (int i = 0; i < seats.length; i++){
            if (seats[i] == 0){
                System.out.print((i+1) + ". ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] seats = new int[10];
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a seat number to book (1-10) or 0 to exit: ");
            int seatNumber = sc.nextInt();
            if (seatNumber == 0) break;

            bookSeat(seats, seatNumber);
            displayAvailableSeats(seats);
        }
        sc.close();
    }
}
