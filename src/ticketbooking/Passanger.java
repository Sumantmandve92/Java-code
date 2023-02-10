package ticketbooking;

public class Passanger {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Passanger(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passanger [id=" + id + ", name=" + name + "]";
	}
	

}
