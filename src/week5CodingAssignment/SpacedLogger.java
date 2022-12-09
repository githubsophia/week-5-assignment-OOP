package week5CodingAssignment;

public class SpacedLogger implements Logger{ //#3
	
	@Override
	public void Log(String a) {
		System.out.println(addSpaces(a)); //#6/7
	} 
	
	@Override
	public void Error(String b) {
		System.out.println("Error: " + addSpaces(b)); //#6/7/8
	}
	
	
	
	
	//#6
	private StringBuilder addSpaces(String word)
	{
StringBuilder spacedString = new StringBuilder();
for (int i = 0; i < word.length(); i++)
{
	spacedString.append(word.charAt(i));
	spacedString.append(' '); //#6/7
}

return spacedString;

}
}