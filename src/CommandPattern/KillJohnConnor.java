package CommandPattern;

public class KillJohnConnor implements Befehl
{
	private JohnConnor john;
	/**
	 * @param args
	 */
	public KillJohnConnor()
	{
		john = new JohnConnor(true);
		
	}

	private void KillJohnConnorWithHeadshot()
	{
		john.SetLive(false);
	}
	private void RepairJohnConnor()
	{
		john.SetLive(true);
	}
	
	@Override
	public void execute() 
	{
		KillJohnConnorWithHeadshot();
		
	}

	@Override
	public void undo() 
	{
		RepairJohnConnor();
		
	}	

}
