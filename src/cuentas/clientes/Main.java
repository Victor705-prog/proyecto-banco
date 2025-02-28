package cuentas.clientes;

/**
 * Clase principal que ejecuta el programa de gestión de cuentas bancarias.
 * 
 * @author Víctor Fernández Alcázar
 * @version 1.0
 * @since 2025-02-28
 */

public class Main {
    
    /**
     * Método principal de ejecución del programa.
     */
    
    public static void main(String[] args) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Roger Federer","1000-2365-85-1230456789",5000,0);
        
        operativa_cuenta(cuenta1, 5000);
    }
    
    /**
     * Realiza operaciones de ingreso y retiro sobre una cuenta bancaria.
     * 
     * @param cuenta1  Objeto de la clase Cuenta sobre el que se operará.
     * @param cantidad Cantidad inicial a retirar.
     */
    
    private static void operativa_cuenta(Cuenta cuenta1, float cantidad) {
        System.out.println("El saldo actual es:"+ cuenta1.estado() );
        
        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
