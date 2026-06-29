package Day30;

import java.util.Scanner;

public class code120 {
    public static void main(String[] args) {
        // Scanner helps us take input from the keyboard
        Scanner sc = new Scanner(System.in);
        
        // These are our three arrays acting like a database table
        String[] names = new String[10];
        int[] rollNumbers = new int[10];
        double[] marks = new double[10];
        
        // This variable counts how many students we have actually added
        int count = 0;
        
        // Let's add some default student data first so the program is not empty
        names[0] = "Amit";
        rollNumbers[0] = 101;
        marks[0] = 85.5;
        count = count + 1; // Now count becomes 1

        names[1] = "Rahul";
        rollNumbers[1] = 102;
        marks[1] = 92.0;
        count = count + 1; // Now count becomes 2

        names[2] = "Priya";
        rollNumbers[2] = 103;
        marks[2] = 78.0;
        count = count + 1; // Now count becomes 3

        int choice = 0;
        
        // This loop keeps running the menu until the user types 5 to Exit
        while (choice != 5) {
            // Printing the menu options on screen
            System.out.println("\n--- STUDENT REGISTER MENU ---");
            System.out.println("1. Add New Student Record");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Show Class Topper");
            System.out.println("5. Exit the Program");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // Fixed a common scanner bug where strings get skipped
            
            // Checking what option the user selected
            if (choice == 1) {
                // 1: Adding a new student
                if (count >= 10) {
                    System.out.println("Error: Array is full! Cannot add more.");
                } else {
                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();
                    
                    System.out.print("Enter Roll Number: ");
                    rollNumbers[count] = sc.nextInt();
                    
                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();
                    
                    // Increment count so the next student goes into the next box
                    count = count + 1;
                    System.out.println("Student added successfully!");
                }
            } 
            else if (choice == 2) {
                // 2: Displaying everything using a simple for-loop
                if (count == 0) {
                    System.out.println("No students found in the list.");
                } else {
                    System.out.println("\n--- ALL RECORDS ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Roll No: " + rollNumbers[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                    }
                }
            } 
            else if (choice == 3) {
                // 3:Searching using built-in String function
                System.out.print("Enter name to search: ");
                String searchName = sc.nextLine();
                boolean found = false;
                
                for (int i = 0; i < count; i++) {
                    // converts both to lowercase so search matches even if letters are Capital
                    if (names[i].toLowerCase().contains(searchName.toLowerCase())) {
                        System.out.println("Match Found -> Roll No: " + rollNumbers[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                        found = true;
                    }
                }
                
                if (found == false) {
                    System.out.println("No student found with that name.");
                }
            } 
            else if (choice == 4) {
                // 4: Finding the highest marks (Simple Math logic)
                if (count == 0) {
                    System.out.println("List is empty!");
                } else {
                    double highestMark = marks[0];
                    int bestIndex = 0;
                    
                    // Loop checks every mark against our current highest mark
                    for (int i = 1; i < count; i++) {
                        if (marks[i] > highestMark) {
                            highestMark = marks[i]; // update highest mark value
                            bestIndex = i;         // save where we found it
                        }
                    }
                    
                    System.out.println("Topper is: " + names[bestIndex] + " with " + marks[bestIndex] + " marks!");
                }
            } 
            else if (choice == 5) {
                System.out.println("Exiting... Thank you!");
            } 
            else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }
}
