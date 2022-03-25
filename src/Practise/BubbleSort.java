package Practise;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr= {10, 30, 5, 20, 2};
		int n=arr.length;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
