package shapes;

import java.util.HashSet;

public class TestHashSet {
	public static void main(String [] args) {
		HashSet<Shape> set = new HashSet<>();
		Rectangle AA = new Rectangle(8, 2);
		Triangle BB = new Triangle(6);
		Square CC = new Square(4);
		Ellipse DD = new Ellipse(5, 3);
		
		System.out.println("Ajout de BB :       " + set.add(BB));
		System.out.println("Ajout de AA :       " + set.add(AA));
		System.out.println("Ajout de CC :       " + set.add(CC));
		System.out.println("Ajout de AA :       " + set.add(AA));
		System.out.println("Ensemble :          " + set);
		System.out.println("Taille :            " + set.size());
		System.out.println("Contient AA :       " + set.contains(AA));
		System.out.println("Contient DD :       " + set.contains(DD));
		for (Shape s : set) {
			System.out.println(s);
		}
		System.out.println("Suppression de AA : " + set.remove(AA));
		//System.out.println("Suppression de ZZ : " + set.remove(ZZ));
	}
}
