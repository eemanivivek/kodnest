
public class Pattern21 
{
	public static void main(String[] args) 
	{
		for (int i=5; i>=0; i--)
		{
		   int alph=65;
		   for (int j=0; j<=i; j++)
		   {
		       System.out.print((char) (alph+j) + " ");
		   }
		   System.out.println();
		}
		for (int i=0; i<=5; i++)
		{
		   int alph=65;
		   for (int j=0; j<=i; j++)
		   {
		       System.out.print((char) (alph+j) + " ");
		   }
		   System.out.println();
		}
	}
}
