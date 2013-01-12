package CommandPattern;

public class KillKateBrewster implements Befehl
{
	private KateBrewster kate;
	/**
	 * @param args
	 */
	public KillKateBrewster()
	{
		kate = (KateBrewster) KateBrewster.GetInstance();
		
	}
	
	private void KillKateBrewsterWithHeadshot(int chance)
	{
		int random =(int)(Math.random() * 100);
		System.out.println("Kate hit: " + random + " chance: " + chance);	
		if(random < chance)
		{
			kate.SetLiveStatus(false);
		}
	}
	
	private void RepairKillKateBrewster()
	{
		kate.SetLiveStatus(true);
	}
	
	@Override
	public void execute(int chance) 
	{
		KillKateBrewsterWithHeadshot(chance);
		
	}

	@Override
	public void undo() 
	{
		RepairKillKateBrewster();
		
	}	

}
