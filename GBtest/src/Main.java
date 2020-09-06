
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node();
		root.setValue(0);
		
		fillWithInts(root, 1,5);
		
		//treeDepthOut(root);
		treeWidthOut(root);
		
	}
	
	public static void fillWithInts(Node r, int stage, int stagesAmount) {
		if(stage<stagesAmount) {
			for (int i = 1; i< 6; i++) {
				Node nextStage = r.addCild().setValue(i*stage);
				fillWithInts(nextStage, stage + 1, stagesAmount);
			}
		}
	}
	
	
	public static void treeDepthOut(Node r) {
		System.out.println(r.getValue().toString());
		for(int i =0; i< r.getChilds().size();i++) {
			treeDepthOut(r.getChilds().get(i));
		}
	}
	
	public static void treeWidthOut(Node r) {
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(r);
		while (queue.size()>0) {
			System.out.println(queue.get(0).getValue());
			for(int i =0; i< queue.get(0).getChilds().size();i++) {
			 queue.add(queue.get(0).getChilds().get(i));
			}
			queue.remove(0);
		}
	}
	
	

}
