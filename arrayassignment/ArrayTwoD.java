package com.digiair.training.arrayassignment;
import java.util.Scanner;
public class ArrayTwoD 
{
	public void twoDadd()
	{
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");     
		int row = s2.nextInt();   
		System.out.print("Enter the no. of columns: ");    
		int column = s2.nextInt();   
		
		double a[][]=new double[row][column];   // for row1
        double b[][]=new double[row][column];    //for row	2
        double c[][]=new double[row][column];  
        
       //Row1 input 
        System.out.println("Enter elements of Matrix1:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print("Element [" + (i+1) + "," + (j+1) + "]: ");
                a[i][j]=s2.nextDouble();
            }
        }
       //Row2 input
        System.out.println("Enter elements of Matrix2:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print("Element [" + (i+1) + "," + (j+1) + "]: ");
                b[i][j]=s2.nextDouble();
            }
        }
       //Print Row1
        System.out.println("Matrix1:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
         
        //print Row2
        System.out.println("Matrx2:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
       //Adding 2 Rows
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++)
            {
                c[i][j]=a[i][j]+ b[i][j];
            }
        }
         
        //print output
        System.out.println("The sum of two matrices are");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.print("\n");
        }
	}
}