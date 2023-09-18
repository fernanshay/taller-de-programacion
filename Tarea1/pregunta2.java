import java.util.Scanner;

public class pregunta_2 {
    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar el sueldo bruto del trabajador
        System.out.print("Ingrese el sueldo bruto del trabajador: ");
        double sueldoBruto = scanner.nextDouble();
        
        // Ingresar la AFP a la que pertenece el trabajador (A o B)
        System.out.print("Ingrese la AFP a la que pertenece el trabajador (A o B): ");
        String afp = scanner.next();
        
        // Calcular descuento de AFP
        double descuentoAFP;
        if (afp.equalsIgnoreCase("A")) {
            descuentoAFP = 0.11 * sueldoBruto;
        } else if (afp.equalsIgnoreCase("B")) {
            descuentoAFP = 0.10 * sueldoBruto;
        } else {
            System.out.println("La AFP ingresada no es válida.");
            return;
        }
        
        // Calcular descuento de seguro
        double descuentoSeguro;
        if (sueldoBruto > 3000) {
            descuentoSeguro = 0.07 * sueldoBruto;
        } else if (sueldoBruto >= 1000 && sueldoBruto <= 3000) {
            descuentoSeguro = 0.06 * sueldoBruto;
        } else {
            descuentoSeguro = 0.05 * sueldoBruto;
        }
        
        // Calcular sueldo neto
        double sueldoNeto = sueldoBruto - descuentoAFP - descuentoSeguro;
        
        // Mostrar el sueldo neto
        System.out.println("El sueldo neto del trabajador es: " + sueldoNeto);
    }}
        
