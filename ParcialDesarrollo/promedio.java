import java.util.Scanner;

public class promedio {

    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector:");
        int N = scanner.nextInt();

        int[] numeros = new int[N];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("El promedio es: " + calcularPromedio(numeros));
    }
}
//tiene un costo asintótico lineal O(N), lo que significa que su rendimiento 
//es proporcional al tamaño del vector de entrada.