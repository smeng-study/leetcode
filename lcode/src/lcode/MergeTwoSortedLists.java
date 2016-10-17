package lcode;

/**
 * 21. Merge Two Sorted Lists
 * @author smeng
 *
 */

//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.	

public class MergeTwoSortedLists {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		if(l1.val<l2.val) {
		    l1.next = mergeTwoLists(l1.next,l2);
		    return l1;
		}
		else {
		    l2.next = mergeTwoLists(l1,l2.next);
		    return l2;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(7);
		ListNode n6 = new ListNode(2);
		ListNode n7 = new ListNode(3);
		ListNode n8 = new ListNode(5);
		ListNode n9 = new ListNode(9);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n6.next = n7;
		n6.next = n8;
		n6.next = n9;
		ListNode res = mergeTwoLists(n1,n6);
		while(res!=null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

}
