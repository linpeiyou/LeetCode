package algorithms;

/**
 * 使用O(1)空间，判断一个int值是不是回文
 * 
 * 思路：
 * 1.负数不是回文数
 * 2.不能转换成string或数组，因为要求使用O(1)空间
 * 3.如果要reverse integer，如何考虑溢出问题
 * 
 * 解决：
 * 如： 6543456 和 65433456
 * 6543456 -> 6543 and 654
 * 65433456 -> 6543 and 6543 
 * 将尾数置换到前面来
 * 最后比较两个值，是否相等（位数为偶数）或者除以10之后相等（位数为奇数）
 * PS：如果最后的数字为0，则直接可以判断不是回文数（如果不判断，则会出现错误）
 * 
 * @author peige
 *
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0)) 
			return false;
		int y = 0;
		while(x > y) {
			int mod = x % 10;
			y = y * 10 + mod;
			x /= 10;
		}
		return (x == y || (y / 10 == x));
	}
	
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(0));
		System.out.println(pn.isPalindrome(11));
		System.out.println(pn.isPalindrome(12323));
		System.out.println(pn.isPalindrome(6543456));
		System.out.println(pn.isPalindrome(-2147483648));
		System.out.println(pn.isPalindrome(-2147447412));
		System.out.println(pn.isPalindrome(10));
	}
}
