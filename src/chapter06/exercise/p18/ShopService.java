package chapter06.exercise.p18;

public class ShopService {
	static private ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}

	public static ShopService getInstance() {
		return shopService;
	}

}
