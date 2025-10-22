package p00_fundamentos;

public class MesesForMejorado {
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo",
                "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre",
                "noviembre", "diciembre"};

        for (String mes : meses) {
            System.out.println(mes.toUpperCase() + " - " +
                    mes.substring(0, 3));
        }
    }
}
