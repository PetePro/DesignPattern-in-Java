package structural.composite;

public abstract class Node {
	protected String name;

    public Node(String name){
        this.name = name;
    }

    public void addNode(Node node) throws Exception{
        throw new Exception("Invalid exception");
    }

	public void removeNode(Node node) throws Exception {
		throw new Exception("Invalid exception");
	}

	abstract void display();
}
