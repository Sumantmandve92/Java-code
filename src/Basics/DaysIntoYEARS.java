package Basics;

public class DaysIntoYEARS {

	public static void main(String[] args) {
		int days=395;
		//years
		int years=days/365;
		int temp=days%365;
		int months=temp/30;
		//weeks
		int weeks=(temp%30)/7;
		//remaining days
		int remdays=(temp%30)%7;
		System.out.println("the result is:"+years+"\n"+months+"\n"+weeks+"\n"+remdays);

	}

}
