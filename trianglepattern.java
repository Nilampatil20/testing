
class trianglepattern
{
	public static void main(String[] args)
	{
		// n is number of rows
		final int n = 5;

		// Do for each row
		for (int i = 1; i <= n; i++)
		{
			// Print '*' i times
			for (int j = 1; j <= i; j++) {
				{
					// Print '*' for boundaries
					if (i == n || j == 1 || j == i) {
						System.out.print('*');
					}
					else {
						System.out.print(' ');
					}
				}
			}
			// Move to the next line
			System.out.print(System.lineSeparator());
		}
	}
}