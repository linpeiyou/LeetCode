package linkedlist;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

/**
 * No.21 Merge Two Sorted Lists
 * 
 * @author peige
 *
 */
public class MergeTwoSortedLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode cur = result;
		while(l1 != null || l2 != null) {
			
			if((l1 != null && l2 == null) ||
					(l1 != null && l1.val < l2.val)) {
				cur.next = l1;
				cur = cur.next;
				l1 = l1.next;
			}
			else {
				cur.next = l2;
				cur = cur.next;
				l2 = l2.next;
			}
		}
		return result.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(5);
		ListNode l4 = new ListNode(7);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;

		ListNode l5 = new ListNode(2);
		ListNode l6 = new ListNode(4);
		//ListNode l7 = new ListNode(6);
		//ListNode l8 = new ListNode(8);
		l5.next = l6;
		//l6.next = l7;
		//l7.next = l8;
		
		ListNode node = mergeTwoLists(l1, l5);
		ListNode cur = node;
		while(cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
	}
}
