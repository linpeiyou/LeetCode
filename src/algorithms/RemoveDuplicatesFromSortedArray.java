package algorithms;

import java.util.Arrays;

/**
 * No.26 Remove Duplicates from Sorted Array
 * 题目：
 * 给出一个已排序数组，移除重复元素，返回新长度
 * 不要创建新数组，用O（1）的空间解决问题
 * 
 * For Example:
 * 数组arrays=[1,1,2]
 * return length = 2
 * 
 * **注意**：
 * 不止要返回length
 * 程序中还会检查原来的数组，是否删除了重复的元素
 * 
 * @author peige
 *
 */
public class RemoveDuplicatesFromSortedArray {
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0)
			return 0;
		int len = 1;
		int prev = nums[0];
		for(int num : nums) {
			if(num != prev) {
				prev = num;
				// 让不重复的元素替换掉目前第一个重复的元素
				nums[len] = num;
				++len;
			}
		}
		return len;
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
		int[] nums1 = {1,1,2};
		int[] nums2 = new int[] {2,3,3,3,4,6,7};
		int[] nums3 = new int[] {1,1,2,6,6,23};
		int[] nums4 = {1,1,2,2,2};
		
		System.out.println(rd.removeDuplicates(nums1));
		System.out.println(Arrays.toString(nums1));
		System.out.println(rd.removeDuplicates(nums2));
		System.out.println(Arrays.toString(nums2));
		System.out.println(rd.removeDuplicates(nums3));
		System.out.println(Arrays.toString(nums3));
		System.out.println(rd.removeDuplicates(nums4));
		System.out.println(Arrays.toString(nums4));
	}

}

















