package shapes;

public class Main {
	
	
	public static void main(String[] args ) {
		
		Shape sh1 = new Triangle(10);
		sh1.draw();
		System.out.println(sh1);
		
		Shape sh2 = new Rectangle(8,12);
		sh2.draw();
		System.out.println(sh2);
		
		Shape sh3 = new Square(7);
		sh3.draw();
		System.out.println(sh3);
			
		
		
	}
	

}
