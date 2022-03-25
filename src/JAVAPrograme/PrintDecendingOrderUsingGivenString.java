package JAVAPrograme;

public class PrintDecendingOrderUsingGivenString 
{
	public static void main(String[] args) 
	{
		int[] arr={60, 20, 50, 70, 30, 80, 40};
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
