package com.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

public class NaryPreorder {

	List<Integer> ans = new ArrayList<Integer>();

	public List<Integer> preorder(NaryNode root) {

		if (null == root)
			return ans;

		ans.add(root.val);
		for (NaryNode node : root.children) {
			preorder(node);
		}
		return ans;
	}

}
