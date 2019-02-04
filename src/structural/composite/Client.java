package structural.composite;

/**
 * 
 * 组合模式 Composite Pattern
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。使得用户对单个对象和组合对象的使用具有一致性。
 * @author 彼得大帝
 * 
 */

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
