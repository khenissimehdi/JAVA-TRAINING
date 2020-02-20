package shapes;

import java.util.Collections;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet < String > set = new TreeSet < > ();
        System.out.println("Ajout de BB :       " + set.add("BB"));
        System.out.println("Ajout de AA :       " + set.add("AA"));
        System.out.println("Ajout de CC :       " + set.add("CC"));
        System.out.println("Ajout de AA :       " + set.add("AA"));
        System.out.println("Ensemble :          " + set);
        System.out.println("Taille :            " + set.size());
        System.out.println("Contient AA :       " + set.contains("AA"));
        System.out.println("Contient DD :       " + set.contains("DD"));
        for (String s: set) {
            System.out.println(s);
        }
        System.out.println("Suppression de AA : " + set.remove("AA"));
        System.out.println("Suppression de ZZ : " + set.remove("ZZ"));
        System.out.println(Collections.max(set));
    }
}
