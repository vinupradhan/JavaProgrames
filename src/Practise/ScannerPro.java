package Practise;

import java.util.Scanner;

public class ScannerPro {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int fact = 1;
		
		sc = new Scanner(System.in);
		System.out.println("Enter the No: ");
		int no = sc.nextInt();
		
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
