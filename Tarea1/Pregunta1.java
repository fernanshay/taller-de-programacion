import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        // Declarar la función Scanner para obtener datos
        Scanner scanner = new Scanner(System.in);

        // Preguntar por los aportes y extraer los números
        System.out.println("¿Cuánto es el aporte de Carlos? (Dólares)");
        double montoCarlos = scanner.nextDouble();
        System.out.println("¿Cuánto es el aporte de Luis? (Euros)");
        double montoLuis = scanner.nextDouble();
        System.out.println("¿Cuánto es el aporte de María? (Soles)");
        double montoMaria = scanner.nextDouble();
        System.out.println("¿Cuánto es el aporte de Sandra? (Dólares)");
        double montoSandra = scanner.nextDouble();

        // Cambiar la moneda de euros y soles a dólares
        montoLuis *= 1.4;
        montoMaria *= 3.7;

        // Sumar todos los aportes (aporte final)
        double montoFinal = montoCarlos + montoLuis + montoMaria + montoSandra;

        // Calcular los porcentajes de cada aporte
        double porcentajeCarlos = Math.floor((montoCarlos * 100) / montoFinal);
        double porcentajeLuis = Math.floor((montoLuis * 100) / montoFinal);
        double porcentajeMaria = Math.floor((montoMaria * 100) / montoFinal);
        double porcentajeSandra = Math.floor((montoSandra * 100) / montoFinal);

        // Imprimir los resultados
        System.out.println("El capital asciende a $" + montoFinal);
        System.out.println("Los porcentajes de aportación se dividen de la siguiente manera: \n-Carlos: " + porcentajeCarlos + "% \n-Luis: " + porcentajeLuis + "% \n-María: " + porcentajeMaria + "% \n-Sandra: " + porcentajeSandra + "%");
    }
}
