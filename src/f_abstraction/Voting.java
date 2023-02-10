package f_abstraction;


//Abstraction by using interface


import java.util.Scanner;

interface VotingApp {
	/*
	 * All the instance var. in interface are 'public static final' by default.
	 * As all inst. var. are final ,so there is no chance to redefine it ,they should be defined at the time of declaration 
	 * @ As all var. are initialized, there is no need to declare constructor of interface
	 * */
	int a=10;
	// all methods in interface are  'public abstract'.then at the time of implementation of these methods public access modifier should be there.
	  void registerUser();
	void generateVotingNo();
}
//Kids section...................................................
class Kids implements VotingApp
{


	@Override
	public void registerUser() {
		 
		
		
			System.out.println("You have successfully registered as  a kid .....!");
			 generateVotingNo();
	}

	@Override
	public void generateVotingNo() {
	
		System.out.println("As you are kid ,your Voting Id will not generate ");
		
	}
	
}
//Adults section............................................................
class Adults implements VotingApp
{

	@Override
	public void registerUser() {
		
		System.out.println("You have successfully registered as a Adult .....!");
		 generateVotingNo();
	}

	@Override
	public void generateVotingNo() {
		System.out.println("As you are Adult ,your Voting Id will  generate.\nPlease wait....! ");
		
	}
	
} 
public class  Voting
{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Welcome to Voting Application....!");
		System.out.println("Enter your age to  register for voting Id :");
		int age= scanner.nextInt();
		
		if(age<=12) 
		{
			Kids little=new Kids();
			little.registerUser();
		}
		else 
		{
			Adults old=new Adults();
			old.registerUser();
		}
	}
}
