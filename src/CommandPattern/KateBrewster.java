package CommandPattern;

public class KateBrewster 
{
	private boolean isAlive;
	private boolean hasHead = true;
	private boolean hasSunglasses = false;

	public KateBrewster(boolean isAlive)
	{
		this.isAlive = isAlive;
	}
	public void SetLive(boolean setLive)
	{
		if(setLive == false)
		{
			isAlive = false;
			System.out.println("Kate Brewster is Dead");
		}
		else
		{
			isAlive = true;
			System.out.println("Kate Brewster is Alive");
			
		}
	}
}
