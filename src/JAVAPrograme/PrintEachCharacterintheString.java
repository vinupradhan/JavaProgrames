package JAVAPrograme;

public class PrintEachCharacterintheString 
{
	public static void main(String[] args) 
	{
		String s="Welcome to tyss";
		char ch=(char) (s.charAt(0)-32);
		System.out.println(ch);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(" "+(char)(s.charAt(i+1)-32));
				i=i+1;
			}else{
				System.out.print(s.charAt(i));
			}
		}
	}
}
