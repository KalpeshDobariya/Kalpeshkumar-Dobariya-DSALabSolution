package DSAlab;

import java.util.HashSet;

class Node{
	int nodeData;
	Node leftNode; Node rightNode;
}
public class SumOfNode {
	
	static Node NewNode(int nodeData){
		Node temp= new Node();
		temp.nodeData=nodeData;
		temp.rightNode=null;
		temp.leftNode = null;
		return temp;}
	
	public Node insert(Node root, int key) {
		if (root==null)
	    return NewNode(key);
		
		if (key<root.nodeData)
			root.leftNode=insert(root.leftNode, key);
	    if(key>root.nodeData)
	    	root.rightNode=insert(root.rightNode, key);
	    return root;}
	    
	
	public boolean findPairSum(Node root, int sum, HashSet<Integer> set) {
		if(root==null)
			return false;
		
		if(findPairSum(root.leftNode , sum ,set))
			return true;
		
		if(set.contains(sum - root.nodeData)) {
		    System.out.println( "Pair is ("+ (sum - root.nodeData)+","+(root.nodeData)+ ")");
		    return true; }
		
		else set.add(root.nodeData);	
	    return findPairSum(root.rightNode,sum,set);}
	
	
	public void findSumOfTwoNode(Node root, int sum) {
	    	HashSet<Integer> set= new HashSet<Integer>();
	    	
	    if(!findPairSum(root, sum, set))
	    	System.out.println("nodes are not found");}
	    		
	    	
//Main Program	    	
		
public static void main(String args[]) {
	Node root= null;
	
	SumOfNode SumNode = new SumOfNode();
	
	root =SumNode.insert(root,40);
	root =SumNode.insert(root,20);
	root =SumNode.insert(root,60);
	root =SumNode.insert(root,10);
	root =SumNode.insert(root,30);
	root =SumNode.insert(root,50);
	root =SumNode.insert(root,70);
	
	int sum=135;
	
	SumNode.findSumOfTwoNode(root, sum);
}


}
