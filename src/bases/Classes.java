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
		
		
		
		
		Position pos = new Position();
		
		System.out.println(pos);
		
	}

}
