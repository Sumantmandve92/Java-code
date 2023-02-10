package LambdaExpression;

public class Executer {

	public static void main(String[] args) {
		
		fi.addition(10, 30);
		
//		or
		FunctionalInterface fi=(num1,num2)->
		{
			System.out.println(num1*num2);
		};

	}

	static FunctionalInterface fi=(num1,num2) ->
	{
		System.out.println(num1+num2);
	};
}
