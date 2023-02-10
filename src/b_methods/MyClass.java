package b_methods;

class TestApp {
	 static   public int x=9, y=7;
	}

	class Test extends TestApp
	{
		int i[] = { 0 };
		
		public static void alter(int i[]) {
	        int j[] = { 2 };
	        i = j;
	    }
	}

	public class MyClass extends Test{
		
				public static void main(String[] args) 
			{
				//inher5
				 int i[] = { 1 };
			        alter(i);
			        System.out.println(i[0]+" "+TestApp.x+"  "+TestApp.y);
			}
	}
