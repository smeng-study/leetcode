package lcode;
/**
 * 237. Delete Node in a Linked List
 * @author smeng
 *
 */
//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
//
//Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

public class DeleteNodeinaLinkedList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
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
		deleteNode(n2);
		while(n1!=null) {
			System.out.println(n1.val);
			n1 = n1.next;
		}
	}

}
