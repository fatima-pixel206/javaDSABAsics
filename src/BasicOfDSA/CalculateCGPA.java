package BasicOfDSA;
import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Here we calculate CGPA of a year (2 semesters )");
        System.out.println(" Enter your number of subjects in two  semesters ");
        int noOfSubjects= sc.nextInt();
        double totalQualityPoints=0;
        String  totalGrades=" ";
        int totalCreditHours=0;
        double gradePoint=0;
        for(int i=1;i<=noOfSubjects;i++){
            sc.nextLine();
            System.out.println(" Enter Subject name :"+i);

            String subject_name=sc.nextLine();

            System.out.println(" Enter marks "+ i);
            double marks=sc.nextInt();
            System.out.println(" Enter grade points "+ i);
           gradePoint=sc.nextDouble();

            System.out.println(" Enter Credit hours");
            int creditHours=sc.nextInt();
        totalQualityPoints+=gradePoint*creditHours;
            totalCreditHours+=creditHours;
        }
        double CGPA= totalQualityPoints/ totalCreditHours/2;
        System.out.println(" your CGPA is : "+ CGPA );
        sc.close();
    }
}
