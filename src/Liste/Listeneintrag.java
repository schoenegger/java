package Liste;

import java.util.List;

import TheBeginning.ThomasListe;

public class Listeneintrag{

	/**
	 * @param args
	 */
	private int number;
	Listeneintrag lastObject;
	Listeneintrag nextObject;
	String botschaft;
	
	public Listeneintrag(String botschaft)
	{
		this.botschaft = botschaft;
		this.number = 1;
	}
	
	public void addObjectToList(String botschaft)
	{
		Listeneintrag addObject = new Listeneintrag(botschaft);
		Listeneintrag endObject = GoToEndOfList();
		
		endObject.nextObject = addObject;
		addObject.number = endObject.number++;
		addObject.lastObject = endObject;
		
	}
	
	public void insertObjectToListAtPosition(int number, String botschaft) throws Exception
	{
		Listeneintrag insertObject = new Listeneintrag(botschaft);//Object erzeugen das später eingefügt wird
		
		if(!PositionExists(number) || number < 0)
		{
			if(number == Lenght()+1)
			{
				addObjectToList(botschaft);
				RefreshNumbers();
				return;
			}
			throw new Exception("Number invalide du dödl");
		}
		
		if(number == 1)//Fragt ab ob der Listeneintrag an die erste Position gehört
		{
			
			if(IsListEmpty())
			{
				this.botschaft = botschaft;
				return;
			}
			
			
			
			insertObject.nextObject = this.nextObject;
			this.nextObject.lastObject = insertObject;
			this.nextObject =insertObject;
			insertObject.lastObject = this;
			
			
			//Objekt nachher einfügen und Inhalte vertauschen
			InsertObjectandswitchValues(insertObject);
			RefreshNumbers();
			return;
			
			
		}
		
		Listeneintrag oldInsertPositionObject = GetElementbyNumber(number);
		
		insertObject.nextObject = oldInsertPositionObject;
		insertObject.lastObject = oldInsertPositionObject.lastObject;
		oldInsertPositionObject.lastObject.nextObject = insertObject;
		oldInsertPositionObject.lastObject = insertObject;
		RefreshNumbers();
		return;
	}

	private void InsertObjectandswitchValues(Listeneintrag insertObject) 
	{
		String memBotschaft;
		memBotschaft = insertObject.botschaft;
		insertObject.botschaft = this.botschaft;
		this.botschaft = memBotschaft;
		RefreshNumbers();
	}
	
	public void removeObjectFromList(int number) throws Exception
	{
		if(!PositionExists(number) || number < 0 )
		{
			
			throw new Exception("Number invalide du dödl konnst des ned entfernen");
		}
		Listeneintrag currentObject = GoToStart();
		
		if(number == 1)
		{
			String memBotschaft= currentObject.nextObject.botschaft;
			currentObject.nextObject = currentObject.nextObject.nextObject;
			currentObject.nextObject.lastObject = currentObject;
			currentObject.botschaft = memBotschaft;
			RefreshNumbers();
			return;
		}
		if(number == this.Lenght())
		{
			currentObject = GoToObjectAt(number);
			currentObject.lastObject.nextObject = null;
			RefreshNumbers();
			return;
		}
		
		currentObject = GoToObjectAt(number);
		currentObject.lastObject.nextObject = currentObject.nextObject;
		currentObject.nextObject.lastObject = currentObject.lastObject;
		RefreshNumbers();
		return;
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public Listeneintrag GoToObjectAt(int number)
	{
		Listeneintrag CurrentObject = GoToStart();
		
		while(CurrentObject.number != number )
		{
			CurrentObject = CurrentObject.nextObject;
			
		}
		
		return CurrentObject;
		
	}
	private Listeneintrag GoToEndOfList() 
	{
		Listeneintrag currentObject = this;
		
		
		while(currentObject.nextObject != null)
		{
			currentObject = currentObject.nextObject; 
		}
		return currentObject;
	}
	
	@Override 
	public String toString()
	{
		Listeneintrag currentObject = this;
		String alleBotschaften="";
		
		while(currentObject != null)
		{
			alleBotschaften+= " - " + currentObject.botschaft;
			currentObject = currentObject.nextObject; 
		}
		
		return alleBotschaften;
		
	}
	
	private Listeneintrag GetElementbyNumber(int number)
	{
		Listeneintrag currentObject = GoToStart();
		
		while( currentObject != null)
		{
			if(currentObject.number == number)
			{
				return currentObject;
			}
			currentObject = currentObject.nextObject;
			
		}
		return null;
	}
	
	public boolean PositionExists(int number)
	{
		Listeneintrag currentObject = GoToStart();
		
		
		while(currentObject != null)
		{
			if(currentObject.number>=number)
			{
				return true;
				
			}
			currentObject = currentObject.nextObject; 
		}
		
		
		return false;
		
	}
	
	private boolean IsListEmpty()//Schaut nach ob die Liste leer ist
	{
		if(this.botschaft == null)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
    
	private void RefreshNumbers()
	{
		Listeneintrag currentObject = GoToStart();
		currentObject.number = 1;
		currentObject = currentObject.nextObject;
		
		while(currentObject != null)
		{
			currentObject.number = currentObject.lastObject.number +1;
			currentObject = currentObject.nextObject;
		}
		
	}
	
	private Listeneintrag GoToStart() //liefert den Starteintrag der Liste
	{
		Listeneintrag Starteintrag = this;
		
		while(Starteintrag.lastObject != null)
		{
			Starteintrag = Starteintrag.lastObject;
			
		}
		
		return Starteintrag;
	}
	
	public int Lenght()
	{
		int lenght=0;
		Listeneintrag currentObject = GoToStart();
		while(currentObject != null)
		{
			lenght++;
			currentObject = currentObject.nextObject;
		}
		return lenght;
	}
    
}

