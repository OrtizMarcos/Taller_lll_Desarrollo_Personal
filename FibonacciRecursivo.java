public class FibonacciRecursivo {

    public static int fibonacciRecursivo(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El numero Fibonacci en la posicion " + n + " es: " + fibonacciRecursivo(n));
    }
}
