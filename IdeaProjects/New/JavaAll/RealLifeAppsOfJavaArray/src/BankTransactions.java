

public class BankTransactions {
    public static void bankTransactions(double[] transactions){
        double balance = 0;
        double highestDeposit = Double.MIN_VALUE;
        double highestWithdrawal = Double.MAX_VALUE;

        for (double transaction: transactions){
            balance += transaction;
            if (transaction > 0){
                highestDeposit = Math.max(transaction, highestDeposit);

            } else {
                highestWithdrawal = Math.min(transaction, highestWithdrawal);
            }
        }
        System.out.println("Final account balance: " + balance);
        System.out.println("Highest Deposit : " + highestDeposit);
        System.out.println("Highest withdrawal: " + Math.abs(highestWithdrawal));
    }

    public static void main(String[] args) {
        double[] x = {500, -200, -150, 300, 1000, 50};
        bankTransactions(x);

    }
}
