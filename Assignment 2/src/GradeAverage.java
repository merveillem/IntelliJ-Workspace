import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] arg)
    {
        final double testWeight = 0.4;  //Test Weight
        final double midTermWeight = 0.25; //Mid Term Weight
        final double finalExamWeight = 0.35; //final exam weight

        //Scanner in for the keyboard input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Test Score #1: ");
        double test1 = in.nextDouble();
        System.out.print("Enter Test Score #2: ");
        double test2 = in.nextDouble();
        System.out.print("Enter Test Score $3: ");
        double test3 = in.nextDouble();
        System.out.print("Enter Midterm Exam Score: ");
        double midTerm = in.nextDouble();
        System.out.print("Enter Final Exam Score: ");
        double finalExam = in.nextDouble();

        //calculation
        final double testAverage = (test1 + test2 + test3) / 3;
        final double testWeighted = testAverage * testWeight;
        final double midTermWeighted = midTerm * midTermWeight;
        final double finalExamWeighted = finalExam * finalExamWeight;
        final double gradeAverage = testWeighted + midTermWeighted + finalExamWeighted;

        System.out.printf("Grade Average: %.2f%n" ,gradeAverage);

        //if and else if statements for the letter grade
        if( gradeAverage == 60 || gradeAverage <= 69 )
        {
            System.out.println("Letter Grade is: D");
        }
        else if( gradeAverage == 70 || gradeAverage <= 79)
        {
            System.out.println("Letter Grade is: C");
        }
        else if( gradeAverage == 80 || gradeAverage <= 89)
        {
            System.out.println("Letter Grade is: B");
        }
        else if( gradeAverage == 90 || gradeAverage >= 100)
        {
            System.out.println("Letter Grade: A");
        }

        //if and else if questions for the message
        if( gradeAverage == 60 || gradeAverage <= 69)
        {
            System.out.println("I'm sorry. You will have to repeat the course before advancing");
        }
        else{
            System.out.println("Good job. You met the prerequisite for the next course");
        }

    }
}
