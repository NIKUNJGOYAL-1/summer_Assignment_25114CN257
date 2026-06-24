package Day27;

import java.util.Scanner;
public class code108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNo=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Number Of Subjects: ");
        int numSubjects=Integer.parseInt(scanner.nextLine());;

        double[] marks = new double[numSubjects];
        double totalMarks = 0;
        String[] subjectName=new String[numSubjects];
        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter name of "+(i+1)+" Subject:");
            subjectName[i]=scanner.nextLine();
            System.out.print("Enter marks for "+subjectName[i]+ " (out of 100): ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate Percentage
        double percentage = (totalMarks / (numSubjects * 100)) * 100;

        // Determine Grade
        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';

        // Display the Marksheet
        System.out.println("\n==========================================");
        System.out.println("            STUDENT MARKSHEET             ");
        System.out.println("==========================================");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("------------------------------------------");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectName[i]+ " : " + marks[i]);
        }
        System.out.println("------------------------------------------");
        System.out.printf("Total Marks : %.2f / 500.0\n", totalMarks);
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("Grade       : " + grade);
        System.out.println("==========================================");

        scanner.close();
}
}
