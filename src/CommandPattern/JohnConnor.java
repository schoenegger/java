package CommandPattern;

public class JohnConnor extends Person
{
	private static Person JohnInstance;
	
	public JohnConnor()
	{
		
	}
	
	public static Person GetInstance()
	{
		if(JohnInstance == null) 
		{
			JohnInstance = new JohnConnor();
		}
		
		return JohnInstance;
		
	}

	@Override
	public void SetLiveStatus(boolean live) {
		JohnInstance.isAlive = live;
		
	}

	@Override
	public boolean GetLiveStatus() {
		return JohnInstance.isAlive;
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
