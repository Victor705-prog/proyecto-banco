package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Roger Federer","1000-2365-85-1230456789",2500,0);
        
        operativa_cuenta(cuenta1, 2300);
    }

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
