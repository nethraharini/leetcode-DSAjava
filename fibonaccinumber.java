// to get index from input and output the value of index 
class Solution {
    public int fib(int n) {
        int num1 = 0, num2 = 1;

        // Handle base cases
        if (n == 0) {
            return num1;  // If n is 0, return 0
        } else if (n == 1) {
            return num2;  // If n is 1, return 1
        }

        // Fibonacci calculation for n > 1
        int fibNumber = 0;
        for (int i = 2; i <= n; i++) {
            fibNumber = num1 + num2;  // Fibonacci formula
            num1 = num2;  // Shift the numbers
            num2 = fibNumber;  // Update the second number
        }

        return fibNumber;  // Return the Fibonacci number at the nth position
    }
}

// input
// 2 index of 2 is 1
// output
// 1

