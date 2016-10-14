package lcode;

/**
 * 83. Remove Duplicates from Sorted List
 * @author si
 *
 */

//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given 1->1->2, return 1->2.
//Given 1->1->1->2->3->3, return 1->2->3.

public class RemoveDuplicatesfromSortedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode fake = head;
		while(fake!=null) {
			while(fake.next!=null && (fake.val == fake.next.val)) {
				fake.next = fake.next.next;
			}
			fake = fake.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ListNode res = deleteDuplicates(n1);
		while(res!=null) {
			System.out.println(res.val);
			res = res.next;
		}
		
		
	}

}
