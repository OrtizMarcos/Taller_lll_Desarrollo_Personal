import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese los números separados por espacios: ");
            String[] input = scanner.nextLine().split(" ");
            
            int[] numeros = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                numeros[i] = Integer.parseInt(input[i]);
            }
            
            int numeroRepetido = encontrarNumeroRepetido(numeros);
            if (numeroRepetido != -1) {
                System.out.println("¿Algun valor aparece al menos dos veces en el vector? Verdadero");
                System.out.println("El numero repetido es: " + numeroRepetido);
            } else {
                System.out.println("¿Algun valor aparece al menos dos veces en el vector? Falso");
            }
        }
    }

    public static int encontrarNumeroRepetido(int[] numeros) {
        Set<Integer> conjunto = new HashSet<>();

        for (int num : numeros) {
            if (conjunto.contains(num)) {
                return num;
            }
            conjunto.add(num);
        }

        return -1;
    }
}
//la verificación como la inserción tienen un costo promedio constante,
// el tiempo total de ejecución aumenta linealmente con el tamaño del vector (n),
// lo que resulta en una complejidad O(n).
