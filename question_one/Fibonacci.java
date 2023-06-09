package question_one;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
 * 
 */

 public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of Fibonacci numbers to generate
        int[] fib = new int[n]; // initialize an array to hold the Fibonacci numbers
        fib[0] = 0; // first Fibonacci number is 0
        fib[1] = 1; // second Fibonacci number is 1

        // Loop through the array starting from index 2 to generate the rest of the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2]; // compute the next Fibonacci number by adding the two previous numbers
        }

        System.out.print("Fibonacci sequence: ");
        // Loop through the Fibonacci array and print each number
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " "); // print the sequence separated by spaces
        }
    }

}

