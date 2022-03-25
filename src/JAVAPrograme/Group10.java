package JAVAPrograme;

import java.util.LinkedHashSet;

public class Group10 {

	public static void main(String[] args) {
		
		String s="India";
		s=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
		}
	}
}
