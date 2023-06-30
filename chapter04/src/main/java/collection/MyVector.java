package collection;

import java.util.*;

public class MyVector extends Vector{

	@Override
	public synchronized String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<this.size(); i++) {
			sb.append(this.get(i)).append((i==this.size()-1 ? "":", "));
		}
		return sb.toString();
	}
	
}
