package intro;

public class Launch {

	public static void main(String[] args) {
		Address a =new Address(18,"1st cross"," RT Nagar",506223,"Bangalore","Karnataka","India");
		Student s= new Student("Munaf",118,false,a);
		
		System.out.println(s);
		

	}

}
