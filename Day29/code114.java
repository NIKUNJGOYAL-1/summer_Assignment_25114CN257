package Day29;

import java.util.Arrays;
import java.util.Scanner;

public class code114 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;
        int choice;

        do {
            // Display system options to the user
            System.out.println("\n===== ARRAY MANAGEMENT SYSTEM =====");
            System.out.println("1. Create / Initialize Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element (Linear Search)");
            System.out.println("4. Sort Array (Ascending)");
            System.out.println("5. Find Maximum and Minimum");
            System.out.println("6. Exit");
            System.out.print("Enter your selection (1-6): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Initialize the array
                    System.out.print("Enter the size of the array: ");
                    int size = scanner.nextInt();
                    arr = new int[size];
                    System.out.println("Enter " + size + " integer elements:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Element [" + i + "]: ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("🎉 Array initialized successfully.");
                    break;

                case 2:
                    // Display array terms safely
                    if (isArrayEmpty(arr)) break;
                    System.out.print("Current Array Content: ");
                    displayArray(arr);
                    break;

                case 3:
                    // Find a specific term inside the array
                    if (isArrayEmpty(arr)) break;
                    System.out.print("Enter the value to search for: ");
                    int target = scanner.nextInt();
                    int index = linearSearch(arr, target);
                    if (index != -1) {
                        System.out.println("🎯 Element found at zero-based index: " + index);
                    } else {
                        System.out.println("❌ Element not found in the array.");
                    }
                    break;

                case 4:
                    // Sort array
                    if (isArrayEmpty(arr)) break;
                    Arrays.sort(arr);
                    System.out.print("Sorted Array: ");
                    displayArray(arr);
                    break;

                case 5:
                    // min and max term of array
                    if (isArrayEmpty(arr)) break;
                    findMinMax(arr);
                    break;

                case 6:
                    //exit case
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid entry! Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // method to check whether array is empty or not
    private static boolean isArrayEmpty(int[] arr) {
        if (arr == null) {
            System.out.println("⚠️ Error: Initialize the array first using Option 1.");
            return true;
        }
        return false;
    }

    // Helper method to neatly output array elements
    private static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // method for searching a term in array
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Method to find min and mex term in array
    private static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("📉 Minimum Value: " + min);
        System.out.println("📈 Maximum Value: " + max);
    }
}
