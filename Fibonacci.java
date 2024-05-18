public class Fibonacci {

    public static int fibonacciIterativo(int n) {
        if (n <= 1)
            return n;
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El numero  Fibonacci en la posicion " + n + " es: " + fibonacciIterativo(n));
    }
}
