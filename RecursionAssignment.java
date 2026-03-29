public class RecursionAssignment {

    //TASK 1
    // O(n) — the function calls itself n times, once per integer
    // Each call does O(1) work (one multiplication and one addition), so total work is proportional to n.
    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
    }

    //TASK 2
    // Sum of first n elements of an array
    // O(n) — we visit each of the n elements exactly once, making one recursive call per element until we reach index 0.

    public static int sumOfArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    //TASK 3
    // Sum of first n powers of base
    // O(n) — the function calls itself n+1 times (from power n down to 0), and Math.pow() is treated as O(1) here, so total is O(n).
    public static double sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    //TASK 4
    // Print N numbers in reverse order — NO arrays, NO loops (not even for input)
    // Read one number recursively, then print it after the recursive call returns.
    // This way the last number read is printed first (reverse order).
    // O(n) — we make exactly n recursive calls, one per number.
    // Each call reads one integer and does O(1) work besides the recursion.
    public static void printReverse(int n, java.util.Scanner sc) {
        if (n == 0) {
            return;
        }
        int num = sc.nextInt();
        printReverse(n - 1, sc);
        System.out.print(num + " "); // print After recursion — gives reverse order
    }

    //Main
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        //Task 1 test
        System.out.println("=== Task 1: Sum of Squares ===");
        int n = 4;
        int result1 = sumOfSquares(n);
        System.out.println("Sum of squares for n=" + n + ": " + result1);

        //Task 2 test
        System.out.println("\n=== Task 2: Sum of Array ===");
        int[] arr = {3, 1, 4, 1, 5};
        int result2 = sumOfArray(arr, arr.length);
        System.out.println("Sum of array elements: " + result2);

        //Task 3 test
        System.out.println("\n=== Task 3: Sum of Powers ===");
        int b = 4, power = 3;
        double result3 = sumOfPowers(b, power);
        System.out.println("Sum of powers b=" + b + ", n=" + power + ": " + result3);

        // Task 4 test
        System.out.println("\n=== Task 4: Reverse Print ===");
        System.out.println("Enter N:");
        int count = sc.nextInt();
        System.out.println("Enter " + count + " numbers:");
        printReverse(count, sc);
        System.out.println();

        sc.close();
    }
}