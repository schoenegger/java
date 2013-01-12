package CommandPattern;

public class KillJohnConnor implements Befehl
{
	
	
	private static JohnConnor john;
	/**
	 * @param args
	 */
	public KillJohnConnor()
	{
		john = (JohnConnor) JohnConnor.GetInstance();
		
	}
	
	private void KillJohnConnorWithHeadshot(int chance)
	{
		int random =(int)(Math.random() * 100);
		System.out.println("John hit: " + random + " chance: " + chance);	
			if(random < chance)
			{
				john.SetLiveStatus(false);
			}
	}
	
	private void RepairJohnConnor()
	{
		john.SetLiveStatus(true);
	}
	
	@Override
	public void execute(int chance) 
	{
		KillJohnConnorWithHeadshot(chance);
		
	}

	@Override
	public void undo() 
	{
		RepairJohnConnor();
		
	}	


}
