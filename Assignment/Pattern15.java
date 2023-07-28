package com.pattern.assignments;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1+5-i; j--)
			{
				System.out.print(j);
			}
			for(int j=i*2; j<5*2-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=1+5-i; k<=5; k++)
			{
				if(k!=1)
					System.out.print(k);
			}
			System.out.println();
		}
	}

}
