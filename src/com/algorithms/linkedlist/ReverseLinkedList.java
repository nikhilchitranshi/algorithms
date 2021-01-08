package com.algorithms.linkedlist;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		ListNode node4 = new ListNode(4, null);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		
		ListNode neahead = reverse(node1);
		
	}
	
	static ListNode reverse(ListNode head) {
		System.out.println("---Called----");
		if(head.next == null) {
			return head;
		}
		
		ListNode newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;		
		return newHead;
	}
}


