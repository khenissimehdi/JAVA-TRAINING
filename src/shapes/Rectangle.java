package shapes;

public class Rectangle {
	private int width, height;
	private char pen = '#';
	private boolean filled = false;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public char getPen()
	{
		return this.pen;
	}
	
	public void setPen (char _pen)
	{
		this.pen = _pen;
	}
	
	public boolean isFilled()
	{
		return this.filled;
	}
	
	public void setFilled(boolean _filled)
	{
		this.filled = _filled;
	}
	
	public void draw()
	{
		
	}
}
