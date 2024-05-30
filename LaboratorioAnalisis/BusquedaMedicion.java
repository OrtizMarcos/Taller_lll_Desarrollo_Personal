import java.util.Arrays;
import java.util.Random;

public class BusquedaMedicion {

    private static int[] generateRandomVector(int N) {
        Random random = new Random();
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = random.nextInt(N + 1);
        }

        return vector;
    }

    private static void performBinarySearches(int[] vector, int N) {
        Random random = new Random();
        long t2, t1;

        Arrays.sort(vector);

        t1 = System.nanoTime();
        for (int i = 0; i < N; i++) {
            int target = random.nextInt(N + 1);
            int index = Arrays.binarySearch(vector, target);
        }
        t2 = System.nanoTime();

        System.out.println("Tiempo de búsqueda binaria es: " + (t2 - t1) + " nanosegundos.");
    }

    private static void performSequentialSearches(int[] vector, int N) {
        Random random = new Random();
        long t2, t1;

        t1 = System.nanoTime();
        for (int i = 0; i < N; i++) {
            int target = random.nextInt(N + 1);
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == target) {
                    break;
                }
            }
        }
        t2 = System.nanoTime();

        System.out.println("Tiempo de búsqueda secuencial es: " + (t2 - t1) + " nanosegundos.");
    }

    public static void main(String[] args) {
        int N = 1000000;

        int[] randomVector = generateRandomVector(N);

        System.out.println("Vector generado: " + Arrays.toString(randomVector));
        //Para poder realizar individualmente puedo comentar cualquiera de las dos funciones
        performSequentialSearches(randomVector, N);

        performBinarySearches(randomVector, N);
    }
}
