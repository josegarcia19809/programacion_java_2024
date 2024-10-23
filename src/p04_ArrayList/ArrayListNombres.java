package p04_ArrayList;

import java.util.ArrayList;

public class ArrayListNombres {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("Kenneth");
        listaNombres.add("Rox");
        listaNombres.add("Lety");

        System.out.println("la lista contiene " + listaNombres.size() + " elementos");

        System.out.println(listaNombres.get(1));
        System.out.println("-".repeat(20));
        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i));
        }

    }
}
