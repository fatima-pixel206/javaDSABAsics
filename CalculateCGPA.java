package BasicOfDSA;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Here we calculate CGPA of a year (2 semesters )");
        System.out.println(" Enter your number of subjects in two  semesters ");
        int noOfSubjects= sc.nextInt();
        double totalGredaPoints=0;
        String  totalGrades=" ";
        int totalCreditHours=0;
        for(int i=1;i<=noOfSubjects;i++){
            sc.nextLine();
            System.out.println(" Enter Subject name :"+i);
            String subject_name=sc.nextLine();
            System.out.println(" Enter Marks "+ i);
            int marks=sc.nextInt();
            System.out.println(" Enter Credit hours");
            int creditHours=sc.nextInt();
            double gradePoint=0;
            String grade=" ";

            if(marks >=90 && marks <= 100){
                gradePoint=4.0;
                grade = "A+";
            }
            else if(marks >= 80 && marks <= 90){
                gradePoint=3.7;
                grade = "A";
            }
            else if(marks >= 70 && marks <= 80){
                gradePoint=3.3;
                grade = "B+";
            }
            else if(marks >= 60 && marks <= 70){
                gradePoint = 2.7;
                grade = "B";

            }
            else if (marks >= 50 && marks >=60){
                gradePoint = 1.8;
                grade  = " C";
            }
            else if(marks >=0 && marks <= 50){
                gradePoint=0.0;
                grade=" D";
            }
            else {
                System.out.println(" Something went wrong");
            }
            double SubjectGP= gradePoint * creditHours;
            totalGredaPoints=totalGredaPoints + SubjectGP;
            totalCreditHours =totalCreditHours +creditHours;


        }
        double GPA= (noOfSubjects / 2) * ((totalGredaPoints / 2) / (totalGredaPoints / 2));
        System.out.println(GPA);

        double CGPA= totalGredaPoints/ totalCreditHours;
        System.out.println(" your CGPA is : "+ CGPA );
        sc.close();
    }
}
