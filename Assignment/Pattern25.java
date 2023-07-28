package com.pattern.assignments;

import java.util.*;
public class Pattern25 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Enter the String which needs to be printed ");
        String input = scanner.nextLine();

        for (int i=1; i<=input.length(); i++) 
        { 
            for (int j=input.length(); j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=i*2-1; k>=1; k--)
            {
                System.out.print(input.charAt(i-1));
            }
            System.out.println("");
        }
        scanner.close();
    }
}
