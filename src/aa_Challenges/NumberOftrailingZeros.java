package aa_Challenges;

public class NumberOftrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		for (int i = 1; true; i++) 
		{
			int temp=i;
			int numberOfFives=0;
			while(temp>0) 
			{
				numberOfFives+=temp/5;
				temp/=5;
			}
			if(numberOfFives==n) 
			{
				System.out.println(i);
				break;
			}
			
		}
	}

}
