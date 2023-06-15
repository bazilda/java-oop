package telran.util.tests;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {	
		int res = Math.abs(o1 % 2) - Math.abs(o2 % 2);
	    if (res == 0) 
	      res = o1 % 2 == 0 ? o1 - o2 : o2 - o1;
	    return res;
	}
}
