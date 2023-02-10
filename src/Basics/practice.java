package Basics;

public class practice
{
	public static void main(String[] args) 
	{
		for (int i = 2; i < 13; i=i+2) 
		{
			for (int j = 0; j < 13; j++) 
			{
				if (j - i <= 0) 
				{
					if (i == j * 2) 
					{
						System.out.print("0");
					} else
					{
						System.out.print("*");
					}
				} else
					System.out.print("0");
			}

			System.out.println();

		}
	}

}
