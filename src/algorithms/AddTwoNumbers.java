package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * No.2 题目：
 * 有两个代表非负数的链表。两个链表中，数字是按逆序存储，并且每个node的数字是只有1位。
 * 把两组数相加并返回链表
 * 例子：
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 * @author peige
 *
 */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListNode head = this;
		for(;;) {
			sb.append(head.val);
			head = head.next;
			if(head != null) {
				sb.append(" -> ");
			}
			else {
				break;
			}
		}
		return sb.toString();
	}
}

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int len1 = 0;
		int len2 = 0;
		
		ListNode cur1 = l1;
		ListNode cur2 = l2;
		for(; cur1 != null; cur1 = cur1.next) 
			++len1;
		for(; cur2 != null; cur2 = cur2.next)
			++len2;

		int max = len1 > len2 ? len1 : len2;
		
		int[] arr = new int[max+1];
		
		cur1 = l1;
		cur2 = l2;
		for(int i = 0; cur1 != null; cur1 = cur1.next, ++i) 
			arr[i] += cur1.val;
		for(int i = 0; cur2 != null; cur2 = cur2.next, ++i) {
			arr[i] += cur2.val;
		}
		for(int i = 0; i < max+1; ++i) {
			if(arr[i] >= 10) {
				arr[i] %= 10;
				arr[i+1] += 1;
			}
		}
		
		// 构造result
		max = arr[max] == 0 ? max : max + 1;
		ListNode result = new ListNode(arr[0]);
		ListNode resCur = result;
		for(int i = 1; i < max; ++i) {
			resCur.next = new ListNode(arr[i]);
			resCur = resCur.next;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(new AddTwoNumbers().addTwoNumbers(l1, l2));
		
		// ======================= Test2 ==========================
		ListNode ll1 = new ListNode(9);
		ListNode ll2 = new ListNode(1);
		ListNode tmpNode = ll2;
		for(int i = 0; i < 9; ++i) {
			tmpNode.next = new ListNode(9);
			tmpNode = tmpNode.next;
		}
		System.out.println(new AddTwoNumbers().addTwoNumbers(ll1, ll2));
		
		// ======================= Test3 ==========================
		ListNode l3_1 = new ListNode(0);
		ListNode l3_2 = new ListNode(7);
		l3_2.next = new ListNode(3);
		System.out.println(new AddTwoNumbers().addTwoNumbers(l3_1, l3_2));
		
	}

}













