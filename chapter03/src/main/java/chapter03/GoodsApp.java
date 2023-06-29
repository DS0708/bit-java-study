package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();				//count++
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(20);
		camera.setCountSold(40);
		
		Goods camera2 = new Goods();			//count ++
		
		System.out.println(camera.getCount());		//static 변수는 인스턴스들이 공유하는 변수이다., count ->2
		
		Goods camera3 = new Goods();			//count++
		
		System.out.println(camera3.getCount());		//count -> 3
		
//		System.out.println("name :" + camera.getName());
//		System.out.println("price :" + camera.getPrice());
//		System.out.println("countStock :" + camera.getCountStock());
//		System.out.println("countSold :" + camera.getCountSold());
		
		camera.showInfo();
		
		int discountPrice = camera.calDiscountPrice(0.3);		//To call instance method, must make instance
		System.out.println(discountPrice);
		
		Goods Tv = new Goods("tv",500000,10,50);		//basic constructor은 호출이 안되고 지정한 생성자만 오버로드되어 호출된다.
		
		System.out.println(Goods.getCount());					//Count is static variable, so GetCount() is Class method(Static method).
	}

}
