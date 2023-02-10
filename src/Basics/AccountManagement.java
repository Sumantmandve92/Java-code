package Basics;

import java.util.Scanner;

public class AccountManagement {
static float balance=0;
	public static void main(String[] args) {
		AccountManagement please=new AccountManagement();
		Scanner sc =new Scanner(System.in);
		String choice=sc.next();
		
		
		switch(choice) 
		{
			case "credit" :
			{
			float amount=sc.nextFloat();
		
			}
		}
	}

	void display() 
	{
		
	}
	void credit(float amount) 
	{
		balance=balance+ amount;
	}
	void debit(float amount) 
	{
		balance=balance-amount;
	}
	

}
