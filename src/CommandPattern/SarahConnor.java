package CommandPattern;

public class SarahConnor extends Person //erbt von Abstrakter klasse
{
	private static Person SaraInstance;
	
	public SarahConnor()
	{
		//Konstruktor
	}
		
	
	
	public static Person GetInstance()
	//Diese Funktions erzeugt SarahConnor Objekt--einmalig
	{
		if(SaraInstance == null) 
		{
			SaraInstance = new SarahConnor();
		}
		
		return SaraInstance;
		
	}


	@Override
	public void SetLiveStatus(boolean live) 
	{
		SaraInstance.isAlive = live;
	}



	@Override
	public boolean GetLiveStatus() 
	{
		return SaraInstance.isAlive;
	}


	@Override
	public void SetSunnGlasses(boolean sunnG) 
	{
		SaraInstance.hasSunglasses = sunnG;
	}



	@Override
	public boolean GetSunnGlassStatus() 
	{
		return SaraInstance.hasSunglasses;
	}
}
