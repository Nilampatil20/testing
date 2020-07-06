
public class rectpattern {

	public static void main(String args[])
	{
		for(int i=4;i>=1;i--)
		{
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
