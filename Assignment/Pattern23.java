package com.pattern.assignments;

public class Pattern23 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<=5; i++)
        {
            int alph=65;
            for (int j=5; j>i; j--)
            {
                System.out.print('A'+" ");
            }

            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alph+i)+" ");
            }
            System.out.println();
        }
	}
}
