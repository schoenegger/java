package CommandPattern;

public class KillSarahConnor implements Befehl
{
	private SarahConnor sarah ;
	/**
	 * @param args
	 */
	public KillSarahConnor()
	{
		sarah = new SarahConnor(true);
		
	}

	private void KillSarahConnorWithHeadshot()
	{
		sarah.SetLive(false);
	}
	private void RepairSarahConnor()
	{
		sarah.SetLive(true);
	}
	@Override
	public void execute() 
	{
		KillSarahConnorWithHeadshot();
		
	}

	@Override
	public void undo() 
	{
		RepairSarahConnor();
		
	}

	
}
