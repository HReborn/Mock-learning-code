package dsa1.introduction;

public class KaratsubaMultiplication {
	public long multiply(long x, long y) {
		
		if (x % 10 == x && y % 10 == y) {
			return x*y;
		}
		int n = 0;
		if (x > y) {
			n = (int) Math.log10(Math.abs(x)) + 1;
		} else {
			n = (int) Math.log10(Math.abs(y)) + 1;
		}
		if (!(n % 2 == 0) ) {
			n++;
		}
		long a = (long) (x / Math.pow(10, n/2));
		long b = (long) (x % Math.pow(10, n/2));
		long c = (long) (y / Math.pow(10, n/2));
		long d = (long) (y % Math.pow(10, n/2));
		
		long ac = this.multiply(a, c);
		long bd = this.multiply(b, d);
		long abcd = this.multiply(a+b, c+d);
		long adbc = abcd - ac - bd;
		long result = (long) (ac*Math.pow(10, n) + adbc*Math.pow(10, n/2) + bd); 
		return result;
	}
}