import java.util.Arrays;
import java.util.Scanner;

public class mediana {

    public static double calcularMediana(int[] numeros) {
        Arrays.sort(numeros);

        int N = numeros.length;
        if (N % 2 == 0) {
            return (double) (numeros[N / 2 - 1] + numeros[N / 2]) / 2;
        } else {
            return (double) numeros[N / 2];
        }
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

        System.out.println("La mediana es: " + calcularMediana(numeros));
    }
}
// Este proceso de ordenamiento tiene un costo de
//O(NlogN) en el peor caso, donde N es el tamaño del vector. 
//Debido a que el ordenamiento toma más tiempo a medida que el vector es más grande, 
//el algoritmo no es lineal, sino que tiene una complejidad mayor.