package prob02;

import java.util.*;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	private static int count=0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		while(scanner.hasNextLine()) {	//hasNext는 안
			String str = scanner.nextLine();
			if(count>=COUNT_GOODS || str.equals("")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str," ");
			goods[count++] = new Goods(st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		// 상품 출
		for(int i=0; i < count ; i++) {
			System.out.println(goods[i]);
		}
		// 자원정리
		scanner.close();
	}
}
