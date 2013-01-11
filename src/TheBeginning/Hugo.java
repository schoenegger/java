package TheBeginning;

public class Hugo {
	
	public static void main(String[] args) 
	{
		String shit = "bla";
		String shit1 = "bla1";
		String shit2 = "bla2";
		String shit3 = "bla3";
		
		ThomasListe dieListe = new ThomasListe(shit);
		dieListe.PushObjectToStack(shit1);
		dieListe.PushObjectToStack(shit2);
		dieListe.PushObjectToStack(shit3);
		
		String nextShit = dieListe.PopObjectfromStack();
		System.out.println("Ausgabe its gleich = " + nextShit);
		
		String nextShit1 = dieListe.PopObjectfromStack();
		System.out.println("Ausgabe its gleich = " + nextShit1);
		
		String nextShit2 = dieListe.PopObjectfromStack();
		System.out.println("Ausgabe its gleich = " + nextShit2);
		
		String nextShit3 = dieListe.PopObjectfromStack();
		System.out.println("Ausgabe its gleich = " + nextShit3);
	}
	

}
