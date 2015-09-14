
public class whichHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HouseName h1 = new HouseName();
		HouseName h2 = new HouseName();
		HouseName h3 = new HouseName();
		
		h1.houseNumber = 2500;
		h2.houseNumber = 2502;
		h3.houseNumber = 2504;
		
		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		System.out.println(h3.houseNumber);
		
		h2=h3;
		
		System.out.println(".................");
		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		System.out.println(h3.houseNumber);
		
		
		

	}

}
