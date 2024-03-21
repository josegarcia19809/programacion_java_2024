package ArrayListCuentaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList para guardar objetos CuentaBancaria
        ArrayList<CuentaBancaria> listaCuentas = new ArrayList<>();

        // Añadir 3 objetos CuentaBancaria al ArrayList
        listaCuentas.add(new CuentaBancaria(100.0));
        listaCuentas.add(new CuentaBancaria(500.0));
        listaCuentas.add(new CuentaBancaria(1500.0));

        // Mostrar cada elemento
        for (int index = 0; index < listaCuentas.size(); index++) {
            CuentaBancaria cuenta = listaCuentas.get(index);
            System.out.println("Cuenta en el índice " + index +
                    "\nBalance: " + cuenta.getBalance());
        }
    }
}
