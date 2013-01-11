package CommandPattern;

import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Vector<Befehl> Befehlsliste = new Vector<Befehl>();
		Befehlsliste.add(new KillJohnConnor());
		Befehlsliste.add(new KillKateBrewster());
		Befehlsliste.add(new KillSarahConnor());
		Befehlsliste.add(new KillKateBrewster());
		Befehlsliste.add(new KillJohnConnor());
		// TODO Auto-generated method stub
		Terminator t800 = new Terminator();
		t800.setCommand(Befehlsliste);
		t800.RepairMode();

	}

}
