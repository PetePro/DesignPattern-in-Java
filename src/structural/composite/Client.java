package structural.composite;

import java.io.File;

public class Client {

	public static void createTree(Node node) throws Exception {
		File file = new File(node.name);
		File[] f = file.listFiles();
		for (File fi : f) {
			if (fi.isFile()) {
				FileNode files = new FileNode(fi.getAbsolutePath());
				node.addNode(files);
			}
			if (fi.isDirectory()) {
				DirectoryNode directory = new DirectoryNode(fi.getAbsolutePath());
				node.addNode(directory);
				createTree(directory);
			}
		}
	}

	public static void main(String[] args) {
		Node noder = new DirectoryNode("D://Course//CST//C");
		try {
			createTree(noder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		noder.display();
	}

}
