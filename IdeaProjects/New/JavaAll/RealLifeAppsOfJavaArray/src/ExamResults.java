import java.util.Scanner;

public class ExamResults {
    public static void checkResults(String[] names, int[] scores){
        System.out.println("\nResults:");
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > 50){
                System.out.println(names[i] + "passed with score: " + scores[i]);
            } else {
                System.out.println(names[i] + "failed with score: " + scores[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Enter the student name: ");
            names[i] = sc.next();
            System.out.println("Enter exam score for " + names[i]+ ":");
            scores[i] = sc.nextInt();
        }
        checkResults(names, scores);
    }
}
