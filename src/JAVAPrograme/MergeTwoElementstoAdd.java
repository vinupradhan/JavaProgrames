package JAVAPrograme;

public class MergeTwoElementstoAdd {

	public static void main(String[] args) {
		
		int a[]={1, 2, 3, 4};
		int b[]={4, 5, 6, 7, 8};
		
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
