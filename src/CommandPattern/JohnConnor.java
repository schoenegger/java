package CommandPattern;

public class JohnConnor 
{
	private boolean isAlive;
	private boolean hasHead = true;
	private boolean hasSunglasses = false;

	public JohnConnor(boolean isAlive)
	{
		this.isAlive = isAlive;
	}
	public void SetLive(boolean setLive)
	{
		if(setLive == false)
		{
			isAlive = false;
			System.out.println("John Connor is Dead");
		}
		else
		{
			isAlive = true;
			System.out.println("John Connor is Alive");
			
		}
	}
}
