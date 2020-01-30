package chess;

public class Position {
	
	private int x,y;
	
	public Position() {
		this.x=0;
		this.y=0;
	}
	
	public Position(int x , int y ) throws IllegalArgumentException
	{
		if (x<0 || x>7 || y<0 || y>7)
		{
			throw new IllegalArgumentException("Position invalide : " + x + "," + y);
		}
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return this.x;
	}
	

	@Override
	public String toString() {
		return "(" + this.x + " , " + this.y + ")"; 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	

}
