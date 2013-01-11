package Liste;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Listeneintrag liste = new Listeneintrag("Die Macht ist mit dir");
		liste.addObjectToList("Andi is a homo");
		liste.addObjectToList("Andi is a homo");
		System.out.println("" + liste.Lenght());
		
		
		System.out.println(liste.toString());
		try 
		{
			liste.insertObjectToListAtPosition(1,"Botschaft");
			System.out.println(liste.toString());
			liste.insertObjectToListAtPosition(2,"Dumm ist der,der dummes tut");
			System.out.println(liste.toString());
			liste.insertObjectToListAtPosition(5,"Vorletzter");
			System.out.println(liste.toString());
			liste.insertObjectToListAtPosition(7,"nix Vorletzter");
			System.out.println(liste.toString());
			
			liste.removeObjectFromList(6);
			liste.removeObjectFromList(1);
			liste.removeObjectFromList(5);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(liste.toString());
	}

}
