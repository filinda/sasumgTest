import java.util.ArrayList;

public class Node {

	private ArrayList<Node> childs;
	private Node parent = null;
	private Object value;
	
	public Node() {
		childs = new ArrayList<Node>();
	}
	
	public Node(Node parent) {
		this.parent = parent;
		childs = new ArrayList<Node>();
	}
	
	public Node addCild(){
		Node child = new Node(this);
		childs.add(child);
		return child;
	}
	
	public ArrayList<Node> getChilds() {
		return childs;
	}

	public Object getValue() {
		return value;
	}

	public Node setValue(Object value) {
		this.value = value;
		return this;
	}

	public Node getParent() {
		return parent;
	}
	
}
