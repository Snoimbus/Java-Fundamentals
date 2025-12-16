import java.util.Scanner;

public class GPACalculator {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    while(true){
        System.out.println("How many classes did you take this semester?: ");
        int NumClasses = input.nextInt();
        
        if(NumClasses <= 0){
            System.out.println("Please enter a positive integer.");
            continue;
        }

        int [] UnitsArray = new int[NumClasses];
        int [] GradesArray = new int[NumClasses];
        
            for (int i = 0; i < NumClasses; i++){ // this loop takes input of units for a class and the grade points for that class
                System.out.println("Enter the units for each class: ");
                UnitsArray[i] = input.nextInt();

                System.out.println("Enter grade points for each class (A=4, B=3, C=2, D=1, F=0): ");
                GradesArray[i] = input.nextInt();
            }
            int TotUnits = 0;
            int TotGradePoints = 0;
            for(int i = 0; i < NumClasses; i++){ // this loop calculates the gpa
                TotUnits += UnitsArray[i];
                TotGradePoints += UnitsArray[i] * GradesArray[i]; // total grade points equals to the sum of (units * grade points) for each class
            }
            double GPA = (double) TotGradePoints / TotUnits;
            System.out.printf("Your GPA is: %.2f%n", GPA);

            if(GPA >= 3.5){ //3.5 and above
                System.out.println("Congratulations! Looks like all that studying paid off!");
            } else if(GPA >= 3.0 ){ // 3.0 - 3.49
                System.out.println("Nice GPA!");
            } else if (GPA > 2.0){ // 2.0 - 3.0
                System.out.println("Study harder, you can do it!");
            } else if (GPA < 2.0){ // anything under 2.0
                System.out.println("Lock in.");
            } else {
                System.out.println("What a rough semester...");
            }

        break;
    }
    input.close();
}
}
