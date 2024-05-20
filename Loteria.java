import java.text.DecimalFormat;
import java.util.*;

public class Loteria {

    // Método para limpiar la pantalla
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        // Usamos un bloque try-with-resources para asegurarnos de cerrar el Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            double montoTotalApostado = 0;
            double montoTotalGanado = 0;

            char jugarOtraVez;

            // Formateador para mostrar los valores de dinero
            DecimalFormat df = new DecimalFormat("#.00");

            do {
                limpiarPantalla();

                // Generar 10 números aleatorios de 2 dígitos
                Set<Integer> numerosLoteria = new HashSet<>();
                while (numerosLoteria.size() < 10) {
                    numerosLoteria.add(random.nextInt(90) + 10);
                }

                limpiarPantalla();

                // Obtener los números del usuario
                System.out.println("Ingrese 10 números de dos dígitos:");
                Set<Integer> numerosUsuario = new HashSet<>();
                while (numerosUsuario.size() < 10) {
                    int numero = scanner.nextInt();
                    if (numero >= 10 && numero <= 99) {
                        if (!numerosUsuario.contains(numero)) {
                            numerosUsuario.add(numero);
                        } else {
                            System.out.println("Número duplicado. Ingrese un número diferente:");
                        }
                    } else {
                        System.out.println("Número no válido. Ingrese un número de dos dígitos:");
                    }
                }

                limpiarPantalla();

                // Obtener el monto a apostar
                System.out.println("Ingrese el monto a apostar:");
                double montoApostado = scanner.nextDouble();
                montoTotalApostado += montoApostado;

                limpiarPantalla();

                // Calcular aciertos
                int aciertos = 0;
                for (int numero : numerosUsuario) {
                    if (numerosLoteria.contains(numero)) {
                        aciertos++;
                    }
                }

                // Calcular ganancia usando switch expression
                double ganancia = switch (aciertos) {
                    case 10 -> montoApostado * 50;
                    case 5 -> montoApostado * 25;
                    case 4 -> montoApostado * 15;
                    default -> 0;
                };

                // Aplicar impuesto
                double impuesto = ganancia * 0.10;
                double montoACobrar = ganancia - impuesto;

                // Acumular ganancia
                montoTotalGanado += montoACobrar;

                // Imprimir resultados
                System.out.println("Números de la lotería: " + numerosLoteria);
                System.out.println("Números ingresados por el usuario: " + numerosUsuario);
                System.out.println("Números acertados: " + aciertos);
                System.out.println("Monto ganado: " + df.format(ganancia));
                System.out.println("Impuesto (10%): " + df.format(impuesto));
                System.out.println("Monto a cobrar: " + df.format(montoACobrar));

                // Mostrar números acertados y errados
                Set<Integer> numerosAcertados = new HashSet<>(numerosUsuario);
                numerosAcertados.retainAll(numerosLoteria);
                Set<Integer> numerosErrados = new HashSet<>(numerosUsuario);
                numerosErrados.removeAll(numerosLoteria);

                System.out.println("Números acertados: " + numerosAcertados);
                System.out.println("Números errados: " + numerosErrados);

                // Preguntar si desea jugar otra vez
                System.out.println("¿Desea jugar otra vez? (s/n):");
                jugarOtraVez = scanner.next().charAt(0);

            } while (jugarOtraVez == 's' || jugarOtraVez == 'S');

            limpiarPantalla();

            // Imprimir resultados finales
            double gananciaTotal = montoTotalGanado - montoTotalApostado;
            System.out.println("Monto total apostado: " + df.format(montoTotalApostado));
            System.out.println("Monto total ganado: " + df.format(montoTotalGanado));
            if (gananciaTotal > 0) {
                System.out.println("Ganancia total: " + df.format(gananciaTotal));
            } else {
                System.out.println("Pérdida total: " + df.format(Math.abs(gananciaTotal)));
            }
            System.out.println("Gracias por jugar!!");
        } // El Scanner se cierra automáticamente aquí
    }
}