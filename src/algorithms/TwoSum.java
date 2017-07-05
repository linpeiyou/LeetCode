package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * No.1 题目：
 * 给出一个数组sums，返回数组中相加等于target的两个数的下标
 * 假设每个输入只有一个答案，而且不能重复使用相同的元素
 * 
 * @author peige
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		// 之前的解决方法：
		/*
		for(int i = 0; i < nums.length; ++i) {
			for(int j = i+1; j < nums.length; ++j) {
				if(nums[i] + nums[j] == target) {
					return new int[] { i, j }; 
				}
			}
		}
		return null;
		*/
		
		// 使用Map，时间复杂度为O(n)
		Map<Integer, Integer> map = new HashMap<>();
		int result[] = new int[2];
		for(int i = 0; i < nums.length; ++i) {
			if(map.containsKey(target - nums[i])) {
				int index = map.get(target - nums[i]);
				result[0] = index;
				result[1] = i;
			}
			map.put(nums[i], i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] ints = t.twoSum(new int[] { 3, 2, 4 }, 6);
		int[] ints2 = t.twoSum(new int[] { 2,7,11,15 }, 9);
		System.out.println(Arrays.toString(ints));
		System.out.println(Arrays.toString(ints2));
	}
}
