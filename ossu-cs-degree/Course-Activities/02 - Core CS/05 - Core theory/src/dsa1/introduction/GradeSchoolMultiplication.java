package dsa1.introduction;

public class GradeSchoolMultiplication {
	public long multiply(long x, long y) {
		int n = 0;
		if (x > y) {
			n = (int) Math.log10(Math.abs(x)) + 1;
		} else {
			n = (int) Math.log10(Math.abs(y)) + 1;
		}
		
		
		return 1;
	}
}