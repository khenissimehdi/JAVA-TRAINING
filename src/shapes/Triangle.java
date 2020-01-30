package shapes;

public class Triangle {

	private int size;
	private char pen = '#';
	private boolean filled = false;
	
	
	public Triangle (int _size)
	{
		this.size = _size;
	}
	
	public char getPen()
	{
		return this.pen;
	}
	
	public void setPen(char _pen)
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
		StringBuilder res = new StringBuilder();
		for(int y = 0; y < this.size; y++)
		{
			
			if(filled)
			{
				for(int x = 0; x < y+1; x++)
				{
					res.append(this.pen);
				}
			}
			else
			{
				if (y != 0)
					res.append(this.pen);
				for(int x = 1; x < y; x++)
				{
					if (y < 1 || y == this.size-1)
					{
						res.append(this.pen);
					}
					else
					{
						res.append(' ');
					}
				}
				res.append(this.pen);
			}
			
			res.append('\n');
		}
		System.out.println(res);
	}

}
