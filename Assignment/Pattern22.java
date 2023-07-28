package com.pattern.assignments;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<=5; i++)
        {
            int alph=65;
            for (int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alph+k));
            }
            for (int l=i-1; l>=0; l--)
            {
                System.out.print((char) (alph+l));
            }
            System.out.println();
        }
	}
}
