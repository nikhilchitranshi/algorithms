package com.algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class NaryPostOrder {

	List<Integer> ans = new ArrayList<Integer>();

	public List<Integer> postorder(Node root) {
		if (root == null)
			return ans;
		for (Node temp : root.children)
			postorder(temp);
		ans.add(root.val);
		return ans;
	}

}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}
