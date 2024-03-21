package ArrayListCuentaBancaria;

/*
 * La clase CuentaBancaria simula una cuenta de banco
 * */
public class CuentaBancaria {
    private double balance; // lo que hay en la cuenta

    public CuentaBancaria() {
        balance = 0.0;
    }

    public CuentaBancaria(double balanceInicial) {
        this.balance = balanceInicial;
    }

    public void depositar(double cantidad) {
        this.balance += cantidad;
    }

    public void retirar(double cantidad) {
        this.balance -= cantidad;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
