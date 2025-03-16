import java.util.Scanner;
public class StudentGrades {

    public static void studentGrades(int n, Scanner x){

        int[] grades = new int[n];
        int sum=0, highest=Integer.MIN_VALUE, lowest=Integer.MAX_VALUE;
        int aboveAverageCount = 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter grade for student " + (i+1) + ":");
            grades[i]=x.nextInt();
            sum+=grades[i];
            highest = Math.max(highest, grades[i]);
            lowest = Math.min(lowest, grades[i]);
        }
        double average = (double) sum/n;
        for(int grade: grades){
            if(grade > average){
                aboveAverageCount++;
            }
        }
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Number of students above average: " + aboveAverageCount);

        x.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = scanner.nextInt();
        studentGrades(n, scanner);
        scanner.close();
    }
}