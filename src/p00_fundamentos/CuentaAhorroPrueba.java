package p00_fundamentos;

class CuentaAhorro {
    private double balance;

    public CuentaAhorro(double balanceInicial) {
        this.balance = balanceInicial;
    }

    public void sacarDinero(double cantidad) {
        System.out.println();
        System.out.println("Intentando sacar " + cantidad + " pesos");

        if (this.balance >= cantidad) {
            this.balance = this.balance - cantidad;
        } else {
            System.out.println("No tienes fondos para sacar " + cantidad + " pesos");
        }
    }

    public double obtenerBalance() {
        return this.balance;
    }
}

public class CuentaAhorroPrueba {
    public static void main(String[] args) {
        CuentaAhorro miCuenta = new CuentaAhorro(5000.00);
        miCuenta.sacarDinero(1000);
        System.out.println("Balance: " + miCuenta.obtenerBalance());

        // sacar 3000
        miCuenta.sacarDinero(3000);
        System.out.println("Balance: " + miCuenta.obtenerBalance());

        // sacar 2000
        miCuenta.sacarDinero(2000);
        System.out.println("Balance: " + miCuenta.obtenerBalance());
        System.out.println(".".repeat(100));
    }
}
