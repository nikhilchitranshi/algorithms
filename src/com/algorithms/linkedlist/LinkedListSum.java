package com.algorithms.linkedlist;

public class LinkedListSum {
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(9);
		
		
		ListNode l2 = new ListNode(1);
		ListNode l22 = new ListNode(9);
		l2.next = l22;
		ListNode l23 = new ListNode(9);
		l22.next = l23;
		ListNode l24 = new ListNode(9);
		l23.next = l24;
		ListNode l25 = new ListNode(9);
		l24.next = l25;
		ListNode l26 = new ListNode(9);
		l25.next = l26;
		ListNode l27 = new ListNode(9);
		l26.next = l27;
		ListNode l28 = new ListNode(9);
		l27.next = l28;
		ListNode l29 = new ListNode(9);
		l28.next = l29;
		ListNode l210 = new ListNode(9);
		l29.next = l210;
		
		addLinkedListNumbers(l1, l2);
		
	}
	
	public static ListNode addLinkedListNumbers(ListNode l1, ListNode l2) {
		
		ListNode p = l1, q=l2;
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		int carry = 0;
		
		while(null!=p || null!=q) {
			int pval = null == p ? 0 : p.val;
			int qval = null == q ? 0 : q.val;
			int sum = pval + qval + carry;
			carry = sum/10;
			int num = sum%10;
			
			curr.next = new ListNode(num);
			curr = curr.next;
			
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
			
		}
		 if (carry > 0) {
		        curr.next = new ListNode(carry);
		    }
		
		return dummyHead.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
