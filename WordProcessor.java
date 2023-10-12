package c3654717;

public class WordProcessor implements Counter {
	
	
	public String text;
	
	
	public String getText()
	{
		return text;
	}
	
	public void setText(String text)
	
	{
		this.text = "hello world";
		
	}
	
	@Override
	public int countWords(String message) 
	{	
		
		if(message == null)
			
			message = getText();
			
		
		int count = message.split("\\s").length;
		return count;
	}
	
	@Override
	public int countLetters(String message) 
	{
		if(message == null)
			
			message = getText();
		
		int count = 0;
		for (int i = 0; i < message.length(); i++) 
		{
			if ( Character.isLetter(message.charAt(i))) 
				count ++;
		
			
		}
		return count;
	}
	
	
	@Override
	public int getLength(String message) {
		if(message == null)
			
			message = getText();
		
		int length = message.length();
		return length;
	}
	
	
	

}
