public class Coordinate {
	private int mX;
	private int mY;
	private int mZ;
	
	public Coordinate (int X, int Y, int Z)
	{
		mX = X;
		mY = Y;
		mZ = Z;
	}
	
	public int getX ()
	{
		return mX;
	}
	public int getY ()
	{
		return mY;
	}
	public int getZ ()
	{
		return mZ;
	}
	public void setX (int X)
	{
		this.mX = X; 
	}
	public void setY (int Y)
	{
		this.mY = Y;
	}
	public void setZ (int Z)
	{
		this.mZ = Z;
	}
	public static Coordinate add (Coordinate C1, Coordinate C2)
	{
		return new Coordinate (C1.mX + C2.mX, C1.mY + C2.mY, C1.mZ + C2.mZ);
	}
	public static Coordinate subtract (Coordinate C1, Coordinate C2)
	{
		return new Coordinate (C1.mX - C2.mX, C1.mY - C2.mY, C1.mZ - C2.mZ);
	}
	public static double distance (Coordinate C1, Coordinate C2)
	{
		return (Math.sqrt ((C1.mX - C2.mX)*(C1.mX - C2.mX) +
						   (C1.mX - C2.mX)*(C1.mX - C2.mX) +
						   (C1.mX - C2.mX)*(C1.mX - C2.mX)));
	}
}
