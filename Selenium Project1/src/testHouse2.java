
public class testHouse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseName h1 = new HouseName();
		HouseName h2 = new HouseName();
		
		h1.houseNumber = 100;
		h1.type = "Lux";
		
		h1.buyHouse(100000);
		
		h2.houseNumber = 200;
		h2.type = "Normal";
		
		h2.buyHouse(500000);
		
		//called static function from class HouseName
		HouseName.payTax();
		
	}
}
