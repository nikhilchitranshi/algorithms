package com.algorithms.linkedlist;

public class Palindrome {

	public boolean isPalindrome(ListNode head) {

		ListNode slow = head, fast = head;

		if (head == null || head.next == null)
			return true;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		if (fast != null && fast.next == null)
			slow = slow.next;

		fast = head;
		ListNode nextHalf = reverse(slow);

		while (nextHalf != null) {
			if (nextHalf.val != fast.val)
				return false;
			nextHalf = nextHalf.next;
			fast = fast.next;
		}
		return true;
	}

	public ListNode reverse(ListNode head) {
		ListNode current = head, previous = null, next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

}
