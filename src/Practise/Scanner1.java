package Practise;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int no = sc.nextInt();
		
		for(int i=no;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
}
