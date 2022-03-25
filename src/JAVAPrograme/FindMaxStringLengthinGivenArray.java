package JAVAPrograme;

public class FindMaxStringLengthinGivenArray 
{
	public static void main(String[] args) 
	{
		String[] arr={"Hello", "Welcome", "to", "Java", "Samsung"};
		String maxElement=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(maxElement.length()<arr[i].length())
			{
				maxElement=arr[i];
			}		
		}
		for(int i=0;i<arr.length;i++)
		{
			if(maxElement.length()<arr[i].length())
				System.out.println(arr[i]);
		}
	}
}