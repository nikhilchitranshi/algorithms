package com.algorithms.linkedlist;

public class MergeLinkedList {
	public static void main(String[] args) {

		ListNode node5 = new ListNode(5, null);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		ListNode node0 = new ListNode(0, node1);

		// [1000000,1000001,1000002]
		ListNode node1000002 = new ListNode(1000002, null);
		ListNode node1000001 = new ListNode(1000001, node1000002);
		ListNode node1000000 = new ListNode(1000000, node1000001);

		new MergeLinkedList().mergeInBetween(node0, 2, 2, node1000000);

	}

	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

		ListNode prev = null, curr = list1;
		int count = 0;

		while (count != a) {
			prev = curr;
			curr = curr.next;
			count++;
		}

		curr = list1;
		count = 0;
		while (count != b) {
			curr = curr.next;
			count++;
		}

		prev.next = list2;

		ListNode current = list2;

		while (current.next != null) {
			current = current.next;
		}

		current.next = curr.next;

		return list1;
	}

}
