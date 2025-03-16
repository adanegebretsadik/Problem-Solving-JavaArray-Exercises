public class StudentsGrades {
    static int[] grades = {85, 56, 75, 91, 68, 84};

    public static int findHighestGrade(){
        int max = grades[0];
        for (int grade: grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
    public static int findLowestGrade(){
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("The Highest grade is: " + findHighestGrade());
        System.out.println("The Lowest grade is: " + findLowestGrade());
    }
}
