package structural.composite;

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
