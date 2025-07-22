
public class GradeManager {
    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {
// Reverse each individual name (like "John" becomes "nhoJ")
// Keep the array order the same
// Return the modified array
    }
    // Method to calculate letter grades
    public static char getLetterGrade(int score) {
// Use if-else conditions:
// 90-100: 'A', 80-89: 'B', 70-79: 'C', 60-69: 'D', below 60: 'F'
            if (score >= 90 && score <= 100) {
                return 'A';
            } else if (score >= 80 && score <= 89) {
                return 'B';
            } else if (score >= 70 && score <= 79) {
                return 'C';
            } else if (score >= 60 && score <= 69) {
                return 'D';
            } else {
                return 'F';
            }
        }
    }
    // Method to find students who need to retake exam
    public static String[] findFailingStudents(String[] names, int[] scores)
    {
// Return array of names where score is below 60
// Use loops to check each student
    }
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};
// Test all your methods
// Display results clearly
    }}