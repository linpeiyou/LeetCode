package algorithms;

import java.util.Arrays;

/**
 * No.27 Remove Element
 * 给出一个数组arr和一个值val，删除掉数组中值为val的元素，并返回新长度len
 * 不要分配新的数组，使用O(1)的内存空间解决问题
 * 
 * 数组中元素的顺序可以改变，在新长度后面的元素可以随便放
 * 例子：nums=[3,2,2,3], val=3
 * return length=2，  改变后的数组可以为[2,2,3,3] （超过length的元素随意）
 * 
 * **思路**：
 * 两个下标i,j分别指向nums的开头和结尾
 * i从头向尾找
 * j从尾向头找
 * i找到一个值为val，j找到一个值为非val
 * 交换
 * 
 * @author peige
 *
 */
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		if(nums.length == 0)
			return 0;
		int len = nums.length;
		int i = -1;
		int j = nums.length;
		for(;;) {
			while(nums[++i] != val) {
				if(i == nums.length-1)
					break;
			}
			while(nums[--j] == val) {
				--len;
				if(j == 0) 
					break;
			}
			if(i >= j)
				break;
			int t = nums[i];
			nums[i] = nums[j];
			nums[j] = t;
			--len;
		}
		return len;
	}
	
	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		int[] nums1 = {1};
		int[] nums2 = new int[] {2,3,3,3,4,6,7};
		int[] nums3 = new int[] {1,1,2,6,6,23};
		int[] nums4 = {1,1,2,2,2};
		//
		System.out.println(re.removeElement(nums1, 3));
		System.out.println(Arrays.toString(nums1));
		// 6   -    7,3,3,3,4,6,2
		System.out.println(re.removeElement(nums2, 2));
		System.out.println(Arrays.toString(nums2));
		// 4   -    1,1,2,23,6,6
		System.out.println(re.removeElement(nums3, 6));
		System.out.println(Arrays.toString(nums3));
		// 2   -    1,1,2,2,2
		System.out.println(re.removeElement(nums4, 2));
		System.out.println(Arrays.toString(nums4));
	}
}











