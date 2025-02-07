class CuentaBancaria {
    String titular;
    double saldo;
    int numeroCuenta;
    static int contadorCuentas = 0;
    static double totalDineroBanco;

    CuentaBancaria (String titular, double deposito) {
        this.titular = titular;
        this.saldo = deposito;
        totalDineroBanco += deposito;
        contadorCuentas++;
        numeroCuenta = contadorCuentas;

    }

    void depositar (double cantidad) {
        this.saldo += cantidad;
        totalDineroBanco += cantidad;

    }

    void retirar (double cantidad) {
        if (saldo - cantidad >= 0){
            this.saldo -= cantidad;
            totalDineroBanco -= cantidad;
        }

    }

    String mostrarInformacion () {
        return titular + " : " + numeroCuenta + " : " + saldo;

    }

    static double obtenerTotalDineroEnBanco () {
        return totalDineroBanco;

    }

    static int obtenerNumeroTotalCuentas () {
        return contadorCuentas;
    }


}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Paco Sanz", 30);
        CuentaBancaria cuenta2 = new CuentaBancaria("Kiko Rivera", 64000);

        cuenta1.depositar(20);
        cuenta2.depositar(10000);

        System.out.println("Cuenta: " + "\n" + cuenta1.mostrarInformacion() + "\n");
        System.out.println("Cuenta: " + "\n" + cuenta2.mostrarInformacion() + "\n");

        cuenta1.retirar(5);
        cuenta2.retirar(4000);

        System.out.println("Cuenta: " + "\n" + cuenta1.mostrarInformacion() + "\n");
        System.out.println("Cuenta: " + "\n" + cuenta2.mostrarInformacion() + "\n");
        System.out.println("Numero total cuentas: " + CuentaBancaria.obtenerNumeroTotalCuentas());
        System.out.println("Dinero total banco: " + CuentaBancaria.obtenerTotalDineroEnBanco());
    }
}