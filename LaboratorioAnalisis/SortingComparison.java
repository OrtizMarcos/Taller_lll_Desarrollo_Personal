import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 1000000, 10000000};

        System.out.println("N\tInserción\tMerge Sort\tQuick Sort");
        for (int size : sizes) {
            int[] randomArray = generateRandomArray(size);

            long startTime = System.nanoTime();
            insertionSort(Arrays.copyOf(randomArray, randomArray.length));
            long insertionTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            mergeSort(Arrays.copyOf(randomArray, randomArray.length));
            long mergeTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            quickSort(Arrays.copyOf(randomArray, randomArray.length));
            long quickTime = System.nanoTime() - startTime;

            System.out.println(size + "\t" + insertionTime + " ns\t" + mergeTime + " ns\t" + quickTime + " ns");
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size + 1);
        }
        return array;
    }

    private static void insertionSort(int[] array) {
        // Implementación del algoritmo de ordenación por inserción
        // ...
    }

    private static void mergeSort(int[] array) {
        // Implementación del algoritmo de ordenación merge sort
        // ...
    }

    private static void quickSort(int[] array) {
        // Implementación del algoritmo de ordenación quick sort
        // ...
    }

}
