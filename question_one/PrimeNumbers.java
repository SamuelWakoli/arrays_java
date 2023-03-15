package question_one;

/**
 * A prime number is a number that is evenly divisible only by itself and 1.
 * For example, the number 5 is prime because it can be evenly divided only by 1 and 5.
 * The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
 * Write a method named isPrime, which takes an integer as an argument and
 * returns true if the argument is a prime number, or false otherwise. Also write main
 * method that displays prime numbers between 1 to 500.
 */

class PrimeNumbers {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // if the number is divisible by any integer between 2 and its square root, it's not prime
            if (number % i == 0) {
                return false;
            }
        }
        return true; // otherwise, it's prime
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}