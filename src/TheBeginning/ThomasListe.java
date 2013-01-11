package TheBeginning;

public class ThomasListe {

	/**
	 * @param args
	 */
	String shit;
	ThomasListe nextObjectStackTL;
	
		public ThomasListe(String shit)
		{
			this.shit = shit;
		}
	

		public void PushObjectToStack(String shit) //Objekt auf dem Stack hinzufügen
		{
			if(this.shit == null)
			{
				this.shit = shit;
			}
			else
			{
				ThomasListe nextObject = new ThomasListe(shit); 
				ThomasListe endOfList = GoToEndOfList();
				endOfList.nextObjectStackTL = nextObject;

			}
		}
		
		public String PopObjectfromStack()
		{
			if(nextObjectStackTL == null)
			{
				if (this.shit == null)//Ist diese Liste leer
				{
					return null;
					
				}
				else 
				{
					String memShit = this.shit;
					this.shit = null;
					return memShit;
					
				}
				
			}
			else 
			{	
				ThomasListe lastObject =  GoToEndOfList();
				String memShit = lastObject.shit;
				DeleteLastObjectFromList();
				return memShit;
				
			}
				
		}

		private void DeleteLastObjectFromList() 
		{
			ThomasListe secondLastObject =  GoToSecondLastPositionOfList();
			secondLastObject.nextObjectStackTL = null;
			
		}
		
		private ThomasListe GoToEndOfList() 
		{
			ThomasListe CurrentObjectTL = this;
			while(CurrentObjectTL.nextObjectStackTL != null)
			{
				CurrentObjectTL = CurrentObjectTL.nextObjectStackTL;
				
			}
			
			return CurrentObjectTL;
		}
		
		private ThomasListe GoToSecondLastPositionOfList() 
		{
			ThomasListe CurrentObjectTL = this;
			while(CurrentObjectTL.nextObjectStackTL.nextObjectStackTL != null)
			{
				CurrentObjectTL = CurrentObjectTL.nextObjectStackTL;
				
			}
			
			return CurrentObjectTL;
		}
		
}
