package lcode;

/**
 * 142. Linked List Cycle II
 * @author smeng
 *
 */

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//Note: Do not modify the linked list.

public class LinkedListCycleII {
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public static ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2!=null && p2.next!=null) {
        	p1=p1.next;
        	p2=p2.next.next;
        	if(p1==p2) {
        		while(head!=p2) {
        			p2 = p2.next;
        			head = head.next;
        		}
        		return head;
        	}
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n3;
		
		System.out.print(detectCycle(n1).val);
	}

}
