package shapes;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
    	ArrayList < Shape > list = new ArrayList < > ();
    	Rectangle A = new Rectangle(8, 2);
    	Triangle B = new Triangle(6);
    	Square C = new Square(4);
    	Ellipse D = new Ellipse(5, 3);
    	Circle X = new Circle(7);
    	Circle Y = new Circle(9);
    	Circle Z = new Circle(11);
    	
        System.out.println("Ajout de B :       " + list.add(B));
        System.out.println("Ajout de A :       " + list.add(A));
        System.out.println("Ajout de C :       " + list.add(C));
        System.out.println("Ajout de A :       " + list.add(A));
        System.out.println("Ajout de X :       " + list.add(X));
        System.out.println("Ajout de Y :       " + list.add(Y));
        System.out.println("Ajout de Z :       " + list.add(Z));
        System.out.println("Liste :            " + list);
        System.out.println("Taille :           " + list.size());
        System.out.println("Contient A :       " + list.contains(A));
        System.out.println("Contient D :       " + list.contains(D));
        for (Shape s: list) {
            System.out.println(s);
        }
        System.out.println("Suppression de A : " + list.remove(A));
        System.out.println("Suppression de Z : " + list.remove(Z));
        Collections.sort(list);
        System.out.println(list);
        int idx = Collections.binarySearch(list, C);
        System.out.println("Indice de C : " + idx);
    }
}
