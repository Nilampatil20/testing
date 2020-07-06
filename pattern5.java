
public class pattern5 {
	public static void main(String args[])
	{
		int var=1;
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<4;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2==0)
				{
				System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				//System.out.print(a);
			}System.out.println();
			var=var+2;
		}
	}

}
