package CommandPattern;

import java.util.Vector;

public class Terminator implements KillingMashines
{
	private Vector<Befehl> log = new Vector<Befehl>();
	private Vector<Befehl> Befehlsliste = new Vector<Befehl>();
	
	public Terminator()
	{
		Befehlsliste.add(new KillSarahConnor());
		
		Befehlsliste.add(new KillJohnConnor());
		
		Befehlsliste.add(new KillKateBrewster());
		
		this.runAmok();
	}
	
	public void setCommand(Vector<Befehl> commandList) 
	{
		this.Befehlsliste = commandList;
		this.runAmok();
		
	}

	@Override
	public void runAmok() 
	{
		for(Befehl command : Befehlsliste) 
		{			
			command.execute();
			log.add(command);
			
		}
		
	}
	public void RepairMode()
	{
		for(Befehl command : log)
		{
			command.undo();
		}
		log = new Vector<Befehl>();
	}
}
