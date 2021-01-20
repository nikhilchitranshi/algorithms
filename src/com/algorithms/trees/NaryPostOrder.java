package com.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

public class NaryPostOrder {

	List<Integer> ans = new ArrayList<Integer>();

	public List<Integer> postorder(NaryNode root) {
		if (root == null)
			return ans;
		for (NaryNode temp : root.children)
			postorder(temp);
		ans.add(root.val);
		return ans;
	}

}

