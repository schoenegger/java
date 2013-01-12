package CommandPattern;

public class KateBrewster extends Person
{
	private static KateBrewster KateInstance;
	
	public KateBrewster()
	{
		
	}
	
	public static Person GetInstance()
	{
		if(KateInstance == null) 
		{
			KateInstance = new KateBrewster();
		}
		
		return KateInstance;
		
	}

	@Override
	public void SetLiveStatus(boolean live) {
		KateInstance.isAlive = live;
		
	}

	@Override
	public boolean GetLiveStatus() {
		return KateInstance.isAlive;
	}

	@Override
	public void SetSunnGlasses(boolean sunnG) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean GetSunnGlassStatus() {
		// TODO Auto-generated method stub
		return false;
	}
}
