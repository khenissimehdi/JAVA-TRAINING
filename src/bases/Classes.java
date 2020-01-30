package bases;

import chess.Position;

public class Classes {
	
	public static void main(String[] args )
	{
		Object obj1 = new Object();
		System.out.println("obj1 : "+obj1);
		
		Object obj2 = obj1;
		System.out.println("obj2 : "+obj2);
		
		Object obj3 = new Object();
		System.out.println("obj2 : "+obj3);
		
		obj2 = new Object();
		System.out.println("obj2 : "+obj2);
		
		obj1 = obj2;
		System.out.println("obj2 : "+obj1);

	
		Position pos1 = new Position();
		Position pos2 = new Position(4,7);
		Position pos3 = new Position(4,7);
		Position pos4 = pos3;
		
		System.out.println("");
		
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
		System.out.println(pos4);
		
		System.out.println("");
		
		System.out.println(pos1.getX());
		System.out.println(pos2.getX());
		
		System.out.println("");
		
		System.out.println(pos1==pos2);
		System.out.println(pos2==pos3);
		System.out.println(pos3==pos4);
		
		System.out.println("");
		
		System.out.println(pos1.equals(pos2));
		System.out.println(pos2.equals(pos3));
		System.out.println(pos3.equals(pos4));
		
		System.out.println("");

		try {
			Position invalid = new Position(-2,12);
			System.out.println(invalid);
		}
		catch (IllegalArgumentException exception)
		{
			System.out.println("Exception attrapée !");
			System.out.println(exception.getMessage());
		}
		
		
		
	}

}
