package h_array;
//lecture : separate negative and positive elements
public class CountNeg_Pos {

	public static void main(String[] args) {
		
		int []a= {2,-4,5,-6,8,-6,1,6,8,-6,1,6,-8,
				-2,6,-5,1,3,6,1,2,3};
		int positive=0,negative=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<0) 
			{
				negative++;
			}
			else 
			{
				positive++;
			}
		}
		System.out.println("positive  and negative elements in array are respectively : "+positive+","+negative);

	}

}
