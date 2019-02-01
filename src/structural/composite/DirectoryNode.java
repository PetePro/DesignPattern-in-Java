package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryNode extends Node {

	List<Node> nodeList = new ArrayList<Node>();

	public DirectoryNode(String name) {
		super(name);
	}

	public void addNode(Node node) throws Exception {
		nodeList.add(node);
	}
	
	public void removeNode(Node node) throws Exception {
		nodeList.remove(node);
	}

	@Override
	void display() {
		System.out.println(name);
		for (Node node : nodeList) {
			node.display();
		}
	}

}
