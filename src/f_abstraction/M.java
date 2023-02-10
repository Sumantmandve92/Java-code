package f_abstraction;
interface Repository
{
	
}
interface CrudRepository extends Repository
{
	void m1();
	void m2();
}
interface JpaRepository extends CrudRepository
{
	void m3();
	void m4();
}
interface StudentRepo extends JpaRepository
{
	void m7();
}
class Hibernate implements JpaRepository implements StudentRepo
{
	void h1() {};
	void h2() {};
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
}

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hibernate hbn=new Hibernate();
	
		//hbn-->can access all methods
		JpaRepository jpa=new Hibernate();
		//jpa-->can access only methods of JpaRepository
	
		CrudRepository crp=new Hibernate();
		//crp-->can access only methods of CrudRepository
		//problem is thet all methods are not accessed by parent reference
		StudentRepo studentRepo=(JpaRepository)new Hibernate();
		
	}

}
