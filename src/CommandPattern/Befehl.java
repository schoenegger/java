package CommandPattern;

public interface Befehl 
{
	public void execute(int chance);
	public void undo();
}
