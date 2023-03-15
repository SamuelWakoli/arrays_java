package question_one;

public class Fibonacci4milli {

    public static int sumEvenFibonacciTerms() {
        // Initialize variables to hold the sum and the first two Fibonacci numbers
        int sum = 0;
        int fib1 = 1;
        int fib2 = 2;

        // Loop through the Fibonacci sequence while the second number is less than or equal to 4 million
        while (fib2 <= 4000000) {
            // Check if the second number is even
            if (fib2 % 2 == 0) {
                // If it's even, add it to the sum
                sum += fib2;
            }

            // Update the Fibonacci numbers for the next iteration
            int temp = fib2;
            fib2 = fib1 + fib2;
            fib1 = temp;
        }

        // Return the sum of the even Fibonacci terms
        return sum;
    }

    public static void main(String[] args) {
        // Call the sumEvenFibonacciTerms method to calculate the sum
        int sum = sumEvenFibonacciTerms();
        // Print the result to the console
        System.out.println("The sum of even-valued Fibonacci terms less than or equal to 4 million is: " + sum);
    }


}
