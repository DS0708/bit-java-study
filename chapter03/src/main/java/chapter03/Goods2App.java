package chapter03;

import mypackage.Goods2;

public class Goods2App extends Goods2{

	public static void main(String[] args) {		//this class is Goods2.java's excution in Goods2.java
		// TODO Auto-generated method stub
		Goods2 g = new Goods2();
		
		g.name = "camera";
		//g.price = 100;	//price is protected, 음 근데 다른 페키지면 무조건 안되는 듯 
		
		
		
//		g.countStock, g.countSold //default and private
	}

}
