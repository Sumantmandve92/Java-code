package f_abstraction;

public class Interface {
	int airBags;
	int lit;
	String panelType;
	int cc;
	String engineCompany;
	int noOfCylinder;
	int sunroofSize;
	String gearBoxType;
	int axel;

	Interface(int airBags,int lit,String panelType,int cc,String engineCompany,int noOfCylinder,int sunroofSize,String gearBoxType,int axel)
	{
		this.airBags=airBags;
		this.lit=lit;
		this.panelType=panelType;
		this.cc=cc;
		this.engineCompany=engineCompany;
		this.noOfCylinder=noOfCylinder;
		this.sunroofSize=sunroofSize;
		this.gearBoxType=gearBoxType;
		this.axel=axel;
	}
	public static void main(String[] args) {
		Interface data= new Interface(6, 1200, "Digital", 13000, "Cumins", 8, 22, "Synchromesh", 2);
	}

}

interface Vehicle {
	
	

	void airBags(int airBags);

	void fuelTank(int lit);

	void controlPanel(String panelType);

	void engine(int cc, String engineCompany, int noOfCylinder);

	void sunRoof(int sunroofSize);

	void gearBox(String gearBoxType);

	void axel(int axel);
}
class Truck implements Vehicle {
	

    public static void main(String[] args) {
	
}

	@Override
	public void airBags(int airBags) {
		System.out.println("Truck required " + airBags + " airBags");
	}

	@Override
	public void fuelTank(int lit) {
		System.out.println("Truck required two fuel tanks with " + lit + " Litres capacity each.");

	}

	@Override
	public void controlPanel(String panelType) {
		System.out.println("Truck control panel should be " + panelType);

	}

	@Override
	public void engine(int cc, String engineCompany, int noOfCylinder) {
		System.out.println(
				"My truck should have " + cc + " cc. and " + noOfCylinder + "cylinder of " + engineCompany + "company");

	}

	@Override
	public void sunRoof(int sunroofSize) {
		System.out.println("truck should hava " + sunroofSize + " inch sunroof");

	}

	@Override
	public void gearBox(String gearBoxType) {
		System.out.println("truck should have " + gearBoxType + " gearbox.");

	}

	@Override
	public void axel(int axel) {
		System.out.println("Truck should have " + axel + "rear drive axels");

	}

}
