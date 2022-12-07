package com.digiair.training.assignment.dec4;
import java.util.Scanner;
public class DiamondPattern 
{
	public void diamond()
	{
		Scanner f=new Scanner(System.in);
		System.out.println("\nEnter the no. of rows : ");
		int n=f.nextInt(); 
		System.out.print("Enter Symbol that needs to be printed in Diamond pattern: ");
		char c = f.next().charAt(0);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
		for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(c);
			}
		System.out.println();
		} 
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
