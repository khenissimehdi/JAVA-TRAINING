package shapes;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList < String > list = new ArrayList < > ();
        System.out.println("Ajout de B :       " + list.add("B"));
        System.out.println("Ajout de A :       " + list.add("A"));
        System.out.println("Ajout de C :       " + list.add("C"));
        System.out.println("Ajout de A :       " + list.add("A"));
        System.out.println("Liste :            " + list);
        System.out.println("Taille :           " + list.size());
        System.out.println("Contient A :       " + list.contains("A"));
        System.out.println("Contient D :       " + list.contains("D"));
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("Suppression de A : " + list.remove("A"));
        System.out.println("Suppression de Z : " + list.remove("Z"));
        Collections.sort(list);
        System.out.println(list);
        int idx = Collections.binarySearch(list, "C");
        System.out.println("Indice de C : " + idx);
    }
}
