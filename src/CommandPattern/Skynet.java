package CommandPattern;

import java.rmi.activation.ActivateFailedException;
import java.util.Vector;

public class Skynet {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Result: "+ SarahConnor.GetInstance().GetLiveStatus());
		System.out.println("Result: "+ JohnConnor.GetInstance().GetLiveStatus());
		System.out.println("Result: "+ JohnConnor.GetInstance().GetLiveStatus());
		System.out.println("///////////////////////////////////");
		
		Vector<Befehl> Befehlsliste = new Vector<Befehl>();
		Befehlsliste.add(new KillJohnConnor());
		Befehlsliste.add(new KillKateBrewster());
		Befehlsliste.add(new KillSarahConnor());
		//Befehlsliste.add(new KillKateBrewster());
		//6Befehlsliste.add(new KillJohnConnor());
		// TODO Auto-generated method stub
		 int budget = 500;
		 
		 T1 t1 = new T1();
		budget = budget -  t1.GetBuildCosts();
		ActivateTerminator(t1, Befehlsliste);
			
		
		T800 t800 = new T800();
		budget = budget -  t800.GetBuildCosts();
		ActivateTerminator(t800, Befehlsliste);
		
		T1000 t1000 = new T1000();
		budget = budget -  t1000.GetBuildCosts();
		ActivateTerminator(t1000, Befehlsliste);
		
		
		
		//t800.RepairMode();

		
		
		
		
		//Terminator t1000 = new();
	}
	
	public static void ActivateTerminator(Terminator txxx,Vector<Befehl> commandList)
	{
		txxx.setCommand(commandList);
		System.out.println("/////////////////////////////////////");
		System.out.println("SarahConnor: "+ SarahConnor.GetInstance().GetLiveStatus());
		System.out.println("JohnConnor: "+ JohnConnor.GetInstance().GetLiveStatus());
		System.out.println("KateBrewster: "+ KateBrewster.GetInstance().GetLiveStatus());
		
	}

}
