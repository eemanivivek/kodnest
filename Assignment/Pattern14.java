
public class Pattern14 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print(j);
			}
			for(int j=i*2; j<5*2; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
