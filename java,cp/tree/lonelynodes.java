import java.util.*;

class BinaryTreeNode{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

class Solution {
    public ArrayList<Integer> getPersonIDs(BinaryTreeNode root) {
		ArrayList<Integer> nodes = new ArrayList<>();
		getPersonIDs(root, false, nodes); // root is not lonely
		return nodes;
	}
	private void getPersonIDs(BinaryTreeNode root, boolean isLonely, ArrayList<Integer> n) {
		// Write your logic here
		Queue<BinaryTreeNode>q=new LinkedList<>();
		if(root==null ){
		    return;
		}
		q.add(root);
		while(!q.isEmpty()){
		    BinaryTreeNode p=q.poll();
		    if((p.left==null || p.left.data==-1) && p.right!=null && p.right.data!=-1){
		        n.add(p.right.data);
		    }
		    if((p.right==null || p.right.data==-1) && p.left!=null && p.left.data!=-1){
		        n.add(p.left.data);
		    }
		    if(p.left!=null){
		        q.add(p.left);
		    }
		    if(p.right!=null){
		        q.add(p.right);
		    }
		}
	}
	
}
public class lonelynodes{
	static BinaryTreeNode root;
	void insert(BinaryTreeNode temp, int key)
    {
			//write your logic here
			BinaryTreeNode nptr=new BinaryTreeNode(key);
			if(temp==null){
			    temp=nptr;
			    return;
			    
			}
			Queue<BinaryTreeNode>q=new LinkedList<>();
			q.add(temp);
			while(!q.isEmpty()){
			    BinaryTreeNode p=q.poll();
			    if(p.left==null){
			        p.left=nptr;
			        break;
			    }
			    else{
			        q.add(p.left);
			    }
			    if(p.right==null){
			        p.right=nptr;
			        break;
			    }
			    else{
			        q.add(p.right);
			    }
			}
    }
    
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		lonelynodes ln=new lonelynodes();
		Solution sol= new Solution();
		
		String str[]=sc.nextLine().split(" ");
		root=new BinaryTreeNode(Integer.parseInt(str[0]));
		for(int i=1; i<str.length; i++)
			ln.insert(root,Integer.parseInt(str[i]));
		ArrayList<Integer> result=sol.getPersonIDs(root);
		Collections.sort(result);
		System.out.println(result);
        sc.close();
	}
}