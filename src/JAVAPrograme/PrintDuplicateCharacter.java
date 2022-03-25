
package JAVAPrograme;
import java.util.HashSet;

public class PrintDuplicateCharacter 
{
	
	public static void main(String[] args) 
	{
		String s="hello";
		
		HashSet<Character> set=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
			System.out.println(set);	
	
		for(Character ch:set)
		{
			int count=0;
			
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}	
			}
			if(count>=2){
			System.out.println(ch+" "+count);
			}
		}
	}
}
