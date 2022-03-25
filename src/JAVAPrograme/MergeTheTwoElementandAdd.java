package JAVAPrograme;

public class MergeTheTwoElementandAdd {

	public static void main(String[] args) {

		int a[]={20, 30, 50, 60};
		int b[]={80, 70, 50, 40, 30};
		
		int count=a.length;
		if(b.length>a.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{	
			try
			{
			System.out.println(a[i]+b[i]);
			}
			catch(Exception e)
			{
				if(b.length>a.length)	
				{
					System.out.println(b[i]);
				}else{
					System.out.println(a[i]);
				}	

			}
		}
	}
}
