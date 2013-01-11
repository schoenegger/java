package CommandPattern;

public class SarahConnor 
{
	private boolean isAlive;
	private boolean hasHead = true;
	private boolean hasSunglasses = false;

	public SarahConnor(boolean isAlive)
	{
		this.isAlive = isAlive;
	}
	public void SetLive(boolean setLive)
	{
		if(setLive == false)
		{
			isAlive = false;
			System.out.println("SarahConnor is Dead");
		}
		else
		{
			isAlive = true;
			System.out.println("SarahConnor is Alive");
			
		}
	}
}
