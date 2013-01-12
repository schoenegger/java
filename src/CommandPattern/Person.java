package CommandPattern;

public abstract class Person 
//Die Abstrakte Klasse definiert welche Member und Methoden eine Person haben muss
{
	protected boolean isAlive = true;
	//private boolean hasHead = true;
	protected boolean hasSunglasses = false;

	
	public abstract void SetLiveStatus(boolean live);
	
	public abstract boolean GetLiveStatus();
	
	public abstract void SetSunnGlasses(boolean sunnG);
	
	public abstract boolean GetSunnGlassStatus();
}
