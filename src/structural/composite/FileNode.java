package structural.composite;

/*
 * Leaf 叶节点对象
 * 叶节点无子节点。
 */

import java.util.ArrayList;
import java.util.List;

public class FileNode extends Node {

	List<Node> nodeList = new ArrayList<Node>();

	public FileNode(String name) {
		super(name);
	}

	public void addNode(Node node) throws Exception {
		nodeList.add(node);
	}

	@Override
	public void display() {
		System.out.println(name);
	}

}
