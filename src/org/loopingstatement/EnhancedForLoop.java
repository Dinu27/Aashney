package org.loopingstatement;

public class EnhancedForLoop {
	
	// Java program to illustrate enhanced for loop
		public static void main(String args[])
		{
			String array[] = {"Dinesh", "Dinu", "Dinesh Dinu"};

			//enhanced for loop
			for (String x:array)
			{
				System.out.println(x);
			}

			/* for loop for same function
			for (int i = 0; i < array.length; i++)
			{
				System.out.println(array[i]);
			}
			*/
		}
	}


