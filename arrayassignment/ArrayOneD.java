package com.digiair.training.arrayassignment;
import java.util.Scanner;

public class ArrayOneD
{
	public void arrayOneDimenion()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("SUM OF ARRAY:");
		System.out.println("Enter total no. of students:");
		int l1 = s1.nextInt();
		float [] array = new float[l1];
		float sum = 0;
		float max = array[0];
		float min = array[0];
		
		//To get input from user
		System.out.println("Enter physics marks for all the students:");
		for(int i=0; i<l1; i++ ) 
		{
	         array[i] = s1.nextFloat();
	     }
		
		//To print the array 
		System.out.println("The entered marks are:");
		for(int j=0; j<l1; j++ ) 
		{
			System.out.print(array[j]+ " ");
	     }
		
		// To check whether array is sorted or not
				boolean sort = true;
				for(int i=0;i<array.length;i++)
				{
					if(array[i] > array[i+1])
					{
						sort = false;
						break;
					}
				}
				if(sort)
					System.out.println("\nThe given array is sorted");
				else
					System.out.println("\nThe Array is not sorted");

		
		//Array in Reverse order	
		System.out.println("\nThe mark array in reverse order:");
        for(int k=array.length-1;k>=0;k--)
        System.out.print(array[k] + "  ");
        
        //To find the maximum array element
        for (int l = 0; l < array.length; l++) 
        {   
           if(array[l] > max)  
              max = array[l]; 
        }
        System.out.println("\nThe maximum value present in the array is "+max);
        
         //To find the minimum array element   
           for (int m = 0; m < array.length; m++) 
           {   
              if(array[m]< min)   
                  min = array[m]; 
           }
           System.out.println("\nThe minimum value present in the array is "+ min);
           
        //To find the sum and average of array marks using FOR EACH loop
		for (float k: array )
            sum = sum + k;
		/*Example sum = 0+first array value -> Answer will be the new sum value. 
		Now the new sum value will get added with the next array value.
		This continues untill the last array is added*/
		System.out.println("\nThe sum of given array is "+sum);
		float avg = sum/array.length;
		System.out.println("The average mark is "+avg);
		
		// To check whether a specific value i present in the array list or not
		System.out.println("Enter a value to check whether it is present in the array or not: ");
		float f1 = s1.nextFloat();
		boolean b = false; 
		for(float x : array)
		{
		    if(x==f1)
		    {
		        b = true;
		        break;
		    }
		}
		if (b)
			  System.out.println("The value matches");
		    else
		    System.out.println("The value does not match");
		
		
	}
}
	

	