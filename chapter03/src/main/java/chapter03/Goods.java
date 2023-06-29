package chapter03;

public class Goods {
	private String name;		//default접근자 
	private int price;
	private int countStock;
	private int countSold;
	
	private static int count = 0;		//All instance share the static variable within same class
	
	public Goods() {	//Java insert automatically insert it.
//		setCount(getCount() + 1);
		this("",0,0,0);			//this() must be written first
		System.out.println("Basic Constructor");
	}

	public Goods(String name, int price, int countStock, int countSold) {
		super();
		System.out.println("OverLoad Constructor");
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
		Goods.setCount(Goods.getCount()+1);
	}
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("name :" + this.name);
		System.out.println("price :" + this.price);
		System.out.println("countStock :" + this.countStock);
		System.out.println("countSold :" + this.countSold);
	}

	public int calDiscountPrice(double d) {
		// TODO Auto-generated method stub
		return this.price - (int)(price*d);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Goods.count = count;
	}
}
