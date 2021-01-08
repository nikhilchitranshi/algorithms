package com.algorithms.linkedlist;

public class Intersection {

	public static void main(String[] args) {

		ListNode node8 = new ListNode(8);
		ListNode node3 = new ListNode(3);
		ListNode node5 = new ListNode(5);

		node8.next = node3;
		node3.next = node5;

		// Linked List1
		ListNode node4l1 = new ListNode(4);
		ListNode node1l1 = new ListNode(1);
		node4l1.next = node1l1;
		node1l1.next = node8;

		// Linked List 2

		ListNode node5l2 = new ListNode(5);
		ListNode node6l2 = new ListNode(6);
		ListNode node1l2 = new ListNode(1);
		node5l2.next = node6l2;
		node6l2.next = node1l2;
		node1l2.next = node8;

		new Intersection().getIntersectionNode(node4l1, node5l2);

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		if (headA == headB) {
			return headA;
		}
		int lengthA = 0, lengthB = 0;
		ListNode currentA = headA, currentB = headB;

		while (headA != null) {
			lengthA++;
			headA = headA.next;
		}

		while (headB != null) {
			lengthB++;
			headB = headB.next;
		}

		headA = currentA;
		headB = currentB;

		if (lengthA > lengthB) {
			headA = moveNodeBy(lengthA - lengthB, headA);
		} else {
			headB = moveNodeBy(lengthB - lengthA, headB);
		}

		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	ListNode moveNodeBy(int steps, ListNode head) {
		while (steps > 0) {
			head = head.next;
			steps--;
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
