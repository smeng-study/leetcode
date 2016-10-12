package lcode;

/**
 * 206. Reverse Linked List
 * @author smeng
 *
 */

//Reverse a singly linked list.

public class ReverseLinkedList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode fade = head;
		while(fade!=null) {
        	ListNode next = fade.next;
        	fade.next = pre;
        	pre = fade;
        	fade = next;	
        }
		return pre;
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
		
		ListNode n = reverseList(n1);
		while(n!=null) {
			System.out.print(n.val+" ");
			n = n.next;
		}
		
	}

}
