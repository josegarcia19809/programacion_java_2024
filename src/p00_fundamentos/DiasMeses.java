package p00_fundamentos;

public class DiasMeses {
    public static void main(String[] args) {
        int[] dias = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        String[] meses = {"enero", "febrero", "marzo",
                "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre",
                "noviembre", "diciembre"};


        for (int i = 0; i < 12; i++) {
            System.out.println(meses[i] + " tiene " +
                    dias[i] + " dias.");
        }

    }
}
