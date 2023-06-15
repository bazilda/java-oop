package telran.util.tests;

import java.util.Comparator;

public class DigitsSumComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return getDigitsSum(o1) - getDigitsSum(o2);
	}

	private int getDigitsSum(Integer number) {
		int res = 0;
		
	
	
}