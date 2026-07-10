package dsa1.introduction;

public class KaratsubaMultiplication {
	public long multiply(long x, long y) {
		int n = 0;
		if (x > y) {
			n = (int) Math.log10(Math.abs(x)) + 1;
		} else {
			n = (int) Math.log10(Math.abs(y)) + 1;
		}
		long a = (long) (x / Math.pow(10, n/2));
		long b = (long) (x % Math.pow(10, n/2));
		long c = (long) (y / Math.pow(10, n/2));
		long d = (long) (y % Math.pow(10, n/2));
		
		return 1;
	}
}