package JAVAPrograme;

public class Group11 
{
	public static void main(String[] args) {
		String s="aBc@123";
		String ch="",num="",spl="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='A' && s.charAt(i)=='Z') || (s.charAt(i)=='a' && s.charAt(i)=='z'))
			{
				ch=ch+s.charAt(i);
			}
			else if(s.charAt(i)=='0' && s.charAt(i)=='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spl=spl+s.charAt(i);
			}
			System.out.println(ch+""+num+""+spl);
		}
	}
}
