package CommandPattern;

public class KillKateBrewster implements Befehl
{
	private KateBrewster kate;
	/**
	 * @param args
	 */
	public KillKateBrewster ()
	{
		kate = new KateBrewster(true);
		
	}

	private void KillKateBrewsterWithHeadshot()
	{
		kate.SetLive(false);
	}
	private void RepairKillKateBrewster()
	{
		kate.SetLive(true);
	}
	
	@Override
	public void execute() 
	{
		KillKateBrewsterWithHeadshot();
		
	}

	@Override
	public void undo() 
	{
		RepairKillKateBrewster();
		
	}	

	

}
