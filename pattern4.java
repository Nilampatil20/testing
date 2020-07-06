
public class pattern4 {
	
		public static void main(String args[])
		{ 
			int n=4;
			int count=0;
			for(int i=1;i<=n;i++)
			{
				for(int k=1;k<=n-i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i+count;j++)
				{
					if(j%i==0)
					{
						System.out.print("0");
					}
					else
					{
					System.out.print("1");
					}
				}
				System.out.println();
				count++;
			}
		}

	}



