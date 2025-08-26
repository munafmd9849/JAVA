package intro;

public class Student {
	private String name;
	private int roll_no;
	private boolean backlogs;
	private Address adder;
	public Student(String name, int roll_no, boolean backlogs, Address adder) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.backlogs = backlogs;
		this.adder = adder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public boolean isBacklogs() {
		return backlogs;
	}
	public void setBacklogs(boolean backlogs) {
		this.backlogs = backlogs;
	}
	public Address getAdder() {
		return adder;
	}
	public void setAdder(Address adder) {
		this.adder = adder;
	}
//	public String toString() {
//		return  "Student Details\n"+
//				"Name: "+name+"\n"+
//				"roll_no: "+roll_no+"\n"+
//				"backlogs: "+backlogs+"\n"+
//				"Address Details : "+
//				adder.getDoorNo()+" "+adder.getStreet()+" "+adder.getLocality()+" "+adder.getPincode()+" "+adder.getCity()+" "+adder.getState()+" "+adder.getCountry();
//	}
	public String toString() {
		return  "Student Details\n"+
				"Name: "+name+"\n"+
				"roll_no: "+roll_no+"\n"+
				"backlogs: "+backlogs+"\n"+
				"Address Details : "+adder;
				
	}
}
