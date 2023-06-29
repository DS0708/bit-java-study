package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int count = 0;
		
		while (true) {
			int zzak_count=0;
			count  ++;
			if(count >= 100) break;
			
			
			String str = Integer.toString(count);
			
			
			
			for(int i=0; i< str.length(); i++) {
				if((int)str.charAt(i)==51 || (int)str.charAt(i)==54 || (int)str.charAt(i)==57) zzak_count++;
			}
			
			
			if(zzak_count>=1) {
				System.out.print(count+" ");
				for(int i=0 ; i<zzak_count; i++) System.out.print("짝");
				System.out.println();
			}
		}
		
	}
}
