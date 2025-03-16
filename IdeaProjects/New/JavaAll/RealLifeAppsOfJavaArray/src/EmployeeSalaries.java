import java.util.Scanner;

public class EmployeeSalaries {
    public static void processSalaries(String[] names, double[] salaries) {
        double sum = 0, maxSalary = salaries[0], minSalary = salaries[1];
        String maxEmployee = names[0], minEmployee = names[0];
        for (int i=1; i<salaries.length; i++) {
            sum += salaries[i];

            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
                maxEmployee = names[i];
            }
            if (salaries[i] < minSalary) {
                minSalary = salaries[i];
                minEmployee = names[i];
            }
        }
        double avgSalary = sum / salaries.length;
        System.out.println("\nAvg Salary: " + avgSalary);
        System.out.println("Highest-paid Salary: " + maxEmployee+ " $ " + maxSalary);
        System.out.println("Lowest-paid Salary: " + minEmployee+ " $ " + minSalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int num = sc.nextInt();
        String[] names = new String[num];
        double[] salaries = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter employee name: ");
            names[i] = sc.next();
            System.out.println("Enter salary for " + names[i] +":");
            salaries[i] = sc.nextDouble();
        }
        processSalaries(names, salaries);
        sc.close();
    }
}
