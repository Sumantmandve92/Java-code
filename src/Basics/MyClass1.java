package Basics;

public class MyClass1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Diposit d1=new Diposit(2000.0,18.25,52.0);
		//System.out.println(d1.principal);
		interest(d1);// we passed the whole object d1 to method interest()
		System.out.println(d1.principal);
	}
	public static void interest(Diposit x) //Interest() method recives d1 object of Diposit class and stored in x variable
	{
		//
		Diposit d2=x;// we store object d1 in object d2.so all properties of d1 will get in d2
		System.out.println(d2.principal);
		d2.principal+=d2.principal*d2.rate*d2.years/100.0;// if we change value of principal by d2 object then 
		//System.out.println(d2.principal);
	}

}
class Diposit
{
	double principal;
	double rate;
	double years;
	Diposit(double principal,double rate,double years)
	{
		this.principal=principal;
		this.rate=rate;
		this.years=years;
	}
}
