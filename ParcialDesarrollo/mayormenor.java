import java.util.Scanner;

public class mayormenor {

    public static void calcularMayorMenor(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            System.out.println("El vector está vacío.");
            return;
        }

        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            } else if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El menor elemento es: " + menor);
        System.out.println("El mayor elemento es: " + mayor);
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

        calcularMayorMenor(numeros);
    }
}
//el costo total del algoritmo es dominado por el recorrido del vector, que tiene un costo de O(N),
// donde N es el tamaño del vector. Por lo tanto, el algoritmo tiene una complejidad asintótica de O(N).
