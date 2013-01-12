package CommandPattern;

public class KillSarahConnor implements Befehl //Befehl = Interface
{
	private SarahConnor sarah ;
	/**
	 * @param args
	 */
	public KillSarahConnor()
	{
		sarah = (SarahConnor) SarahConnor.GetInstance();
		//Erzeugt einmaliges Sarah Connor objekt
	}

	private void KillSarahConnorWithHeadshot(int chance)
	{
		int random =(int)(Math.random() * 100);
		System.out.println("Sara hit: " + random + " chance: " + chance);	
		if(random < chance)
		{
			sarah.SetLiveStatus(false);
		}
		
	}
	
	private void RepairSarahConnor()
	{
		sarah.SetLiveStatus(false);
	}
	
	@Override
	public void execute(int chance) 
	{
		KillSarahConnorWithHeadshot(chance);
		
	}

	@Override
	public void undo() 
	{
		RepairSarahConnor();
		
	}

	
}
