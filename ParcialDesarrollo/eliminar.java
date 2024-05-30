import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class eliminar {

    public static List<Integer> eliminarElemento(int[] numeros, int valor) {
        List<Integer> resultado = new ArrayList<>();
        for (int num : numeros) {
            if (num != valor) {
                resultado.add(num);
            }
        }
        return resultado;
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
        
        System.out.println("Ingrese el número a eliminar:");
        int valor = scanner.nextInt();
        
        List<Integer> resultado = eliminarElemento(numeros, valor);
        System.out.println("Salida:");
        System.out.println(resultado.size() + ", números = " + resultado);
    }
}
//tiene un costo asintótico de O(n), ya que recorre el vector una vez 
//y copia los elementos diferentes al número dado a un nuevo vector,
// lo que implica operaciones lineales en el tamaño del vector.

