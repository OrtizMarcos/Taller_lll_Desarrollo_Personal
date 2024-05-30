import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mayorfrecuencia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese los números separados por espacios: ");
            String[] input = scanner.nextLine().split(" ");
            int[] numbers = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }   int moda = encontrarModa(numbers);
            System.out.println("La moda es: " + moda);
            // Cerrar el Scanner al finalizar su uso
        }
    }

    public static int encontrarModa(int[] numbers) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int num : numbers) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        int moda = 0;
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        return moda;
    }
}
//la razón por la que el algoritmo tiene un costo asintótico de O(n) (lineal) es porque su tiempo de ejecución 
//crece de manera proporcional al tamaño del vector de entrada. A medida que agregas más números al vector, 
//el algoritmo necesita más tiempo para encontrar la moda, pero ese tiempo aumenta de manera lineal.