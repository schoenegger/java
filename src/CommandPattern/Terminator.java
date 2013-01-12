package CommandPattern;

import java.util.Vector;

public abstract class Terminator implements KillingMashines
{
	private Vector<Befehl> log = new Vector<Befehl>();
	private Vector<Befehl> Befehlsliste = new Vector<Befehl>();
	
	
	public Terminator()
	{
		
		
	}
	
	public void setCommand(Vector<Befehl> commandList) 
	{
		this.Befehlsliste = commandList;
		this.runAmok();
		
	}

	abstract public int GetBuildCosts(); //Jeder der ableitet muss diese Funktion implementieren
	abstract public int GetChanceToHit();
	
	@Override
	public void runAmok() 
	{
		for(Befehl command : Befehlsliste) 
		{			
			command.execute(GetChanceToHit());
			log.add(command);
			
		}
		
	}
	
	@Override
	public void RepairMode()
	{
		for(Befehl command : log)
		{
			command.undo();
		}
		log = new Vector<Befehl>();
		
		//System.out.println("Result: "+ SarahConnor.getLiveStatus());
	}
}
