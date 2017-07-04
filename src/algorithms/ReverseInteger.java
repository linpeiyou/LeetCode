package algorithms;

public class ReverseInteger {
	
	public int reverse(int x) {
		long l = 0;
		boolean b = x > 0;
		x = x > 0 ? x : -x;
		for(int k = 10; x > 0;) {
			l = l * 10 + (x % k);
			x /= 10;
		}
		l = b ? l : -l;
		if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) l;
	}

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(123));
		System.out.println(ri.reverse(-123));
		System.out.println(ri.reverse(1234567899));
	}
}
