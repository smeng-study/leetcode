package lcode;

/**
 * 24. Swap Nodes in Pairs
 * @author smeng
 *
 */

//Given a linked list, swap every two adjacent nodes and return its head.
//
//For example,
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

public class SwapNodesinPairs {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode swapPairs(ListNode head) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode current = pre;
		while(current.next!=null && current.next.next!=null) {
			ListNode n1 = current.next;
			ListNode n2 = current.next.next;
			n1.next = n2.next;
			current.next = n2;
			current.next.next = n1;
			current = current.next.next;
		}
		return pre.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode res = swapPairs(n1);
		while(res!=null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

}
