package question_two;

/*
  A palindrome number is a number that remain the same when read from behind or
  front ( a number that is equal to reverse of number) for example, 353 is palindrome
  because reverse of 353 is 353 (you see the number remains the same). But a number
  like 591 is not palindrome because reverse of 591 is 195 which is not equal to 591.
  Write Java program to check if a number entered by the user is palindrome or not.
  You should provide the user with a GUI interface to enter the number and display
  the results on the same interface.
 */

import javax.swing.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Prompt the user to enter a number using JOptionPane
        String input = JOptionPane.showInputDialog("Enter a number:");
        // Convert the input string to an integer
        int num = Integer.parseInt(input);
        // Initialize an empty string to hold the result
        String result = "";

        // Check if the input number is a palindrome using the isPalindrome method
        if (isPalindrome(num)) {
            // If it's a palindrome, update the result string
            result = " is a palindrome.";
        } else {
            // If it's not a palindrome, update the result string
            result = " is not a palindrome.";
        }

        // Display the input number and the result using JOptionPane
        JOptionPane.showMessageDialog(null, input + result);
    }

    public static boolean isPalindrome(int num) {
        // Initialize variables to hold the reversed number and the original number
        int reversed = 0;
        int original = num;

        // Reverse the digits of the input number using a while loop
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        // Check if the reversed number is equal to the original number
        return original == reversed;
    }

}
