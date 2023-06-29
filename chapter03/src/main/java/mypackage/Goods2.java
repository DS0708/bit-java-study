package mypackage;

public class Goods2 {
	public String name;		//Allow all access
	protected int price;	//Allow same package and child access
	int countStock;			//default -> allow only same package
	private int countSold;	//Allow only same class
}
