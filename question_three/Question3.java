package question_three;

import java.util.Scanner;

/*
Question three: [15 marks]
Write a Java program that takes 15 values of type integer as inputs from user, store the values in an array.
a) Print the values stored in the array on screen.
b) Ask user to enter a number, check if that number (entered by user) is present in array
or not. If it is present print, “the number found at index (index of the number) ” and the text “number not found in this array”
c) Create another array, copy all the elements from the existing array to the new array but in reverse order. Now print the elements of the new array on the screen
d) Get the sum and product of all elements of your array. Print product and the sum each on its own line.
 */

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part a: Store 15 integer values in an array and print the array
        int[] arr = new int[15];
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Values stored in the array: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Part b: Check if a number entered by the user is present in the array or not
        System.out.print("Enter a number to search: ");
        int num = input.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == num) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // Part c: Create a new array with elements in reverse order and print it
        int[] revArr = new int[15];
        for (int i = 0, j = 14; i < 15; i++, j--) {
            revArr[j] = arr[i];
        }
        System.out.print("Values stored in the reversed array: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(revArr[i] + " ");
        }
        System.out.println();

        // Part d: Calculate the sum and product of all elements of the array
        int sum = 0;
        long product = 1; // using long to avoid integer overflow
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
