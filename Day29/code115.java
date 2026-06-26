package Day29;

import java.util.Scanner;

public class code115 {
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to the Java String Manipulation System ===");

        // Keep the application running until the user selects exit
        do {
            // Display standard menu options
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Find Length of a String");
            System.out.println("2. Concatenate Two Strings");
            System.out.println("3. Convert to Uppercase & Lowercase");
            System.out.println("4. Check Equality of Two Strings");
            System.out.println("5. Extract a Substring");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            // Check for valid integer menu entries
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input type. Please enter a valid number (1-6).");
                scanner.next(); 
                System.out.print("Enter your choice (1-6): ");
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = scanner.nextLine();
                    // Obtain string length
                    System.out.println("Result: The length of the string is " + str1.length());
                    break;

                case 2:
                    System.out.print("Enter first string: ");
                    String text1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String text2 = scanner.nextLine();
                    // Merge elements together 
                    String concatenated = text1.concat(text2);
                    System.out.println("Result (Concatenated): " + concatenated);
                    break;

                case 3:
                    System.out.print("Enter text to convert: ");
                    String mixedText = scanner.nextLine();
                    System.out.println("1.Uppercase\n2.Lowercase\n3.Both");
                    int n=scanner.nextInt();
                    if(n==1){
                    System.out.println("Result (Uppercase): " + mixedText.toUpperCase());
                    }
                    else if(n==2){
                    System.out.println("Result (Lowercase): " + mixedText.toLowerCase());
                    }
                    else{
                    System.out.println("Result (Uppercase): " + mixedText.toUpperCase());
                    System.out.println("Result (Lowercase): " + mixedText.toLowerCase());
                    }
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String match1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String match2 = scanner.nextLine();
                    // checks if both the string are equal to each other
                    if (match1.equals(match2)) {
                        System.out.println("Result: Strings match exactly (Case-sensitive).");
                    } else if (match1.equalsIgnoreCase(match2)) {
                        System.out.println("Result: Strings match only when ignoring character cases.");
                    } else {
                        System.out.println("Result: The strings are entirely different.");
                    }
                    break;

                case 5:
                    System.out.print("Enter the base string: ");
                    String original = scanner.nextLine();
                    System.out.print("Enter zero-based starting index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter zero-based ending index (exclusive): ");
                    int end = scanner.nextInt();
                    
                    // Boundary safety evaluation prior to extraction execution
                    if (start >= 0 && end <= original.length() && start <= end) {
                        System.out.println("Result (Substring): " + original.substring(start, end));
                    } else {
                        System.out.println("Error: Provided indices are out of string boundaries.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting System. Thank you for using the program!");
                    break;

                default:
                    System.out.println("Invalid choice selection! Choose an option between 1 and 6.");
            }
        } while (choice != 6);

        // Terminate the scanner
        scanner.close();
    }
}
