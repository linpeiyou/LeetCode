package algorithms;

import java.util.Arrays;

/**
 * 题目：
 * 给出一个数组sums，返回数组中相加等于target的两个数的下标
 * 假设每个输入只有一个答案，而且不能重复使用相同的元素
 * 
 * @author peige
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; ++i) {
			for(int j = i+1; j < nums.length; ++j) {
				if(nums[i] + nums[j] == target) {
					return new int[] { i, j }; 
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] ints = t.twoSum(new int[] { 3, 2, 4 }, 6);
		System.out.println(Arrays.toString(ints));
	}
}
