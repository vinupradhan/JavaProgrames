package JAVAPrograme;

public class DecendingOrder 
{
	public static void main(String[] args) 
	{
		int[] arr={20, 30, 50, 10, 40};
		
		for (int i=0; i<arr.length;i++)
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
			System.out.print(arr[i]+" ");
		}
	}

}
