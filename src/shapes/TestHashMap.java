package shapes;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
    	HashMap < String, Shape > map = new HashMap < > ();
    	map.put("rectangle", new Rectangle(8, 2));
    	map.put("triangle", new Triangle(6));
    	map.put("carré", new Square(4));
    	System.out.println("Map :              " + map);
        System.out.println("Taille :           " + map.size());
        System.out.println("Elément pour vert : " + map.get("vert"));
        System.out.println("Elément pour noir : " + map.get("noir"));
        for (String key: map.keySet()) System.out.println("Clé : " + key);
        for (Shape value: map.values()) System.out.println("Valeur : " + value);
        map.remove("bleu");
        System.out.println("Elément pour bleu : " + map.get("bleu"));
    }
}