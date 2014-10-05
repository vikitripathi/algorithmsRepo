//Binary Search Tree: Classic Data Structures to efficiently implement Symbol Table(Search, Insert, Iterate)
//use of generic key value 
//use of linked list to maintain record as per the BST requirement
public class BST<Key extends Comparable<Key>, Value> {
	private Node root;//root of BST , instance variable
	private class Node//inner class ??? again!
	{
		private Key key;
		private Value val;
		private Node left, right;
		public Node(Key key, Value val)
		{
			this.key = key;
			this.val = val;
		}
	}
     //insert
	//if key in the tree, then reset value
	//else add new node at the required place
	//client insert method!!!
	//no of compares = 1+ depth of node
	 public void put(Key key, Value val)
	 {
		 root = put(root, key, val);//recursive
	 }
	 private Node put(Node x, Key key, Value val)
	 {
		 if (x == null) return new Node(key, val);
		 int cmp = key.compareTo(x.key);
		 if (cmp < 0)
		 x.left = put(x.left, key, val);//recursive
		 else if (cmp > 0)
		 x.right = put(x.right, key, val);
		 else
		 if (cmp == 0)
		 x.val = val;
		 return x;
	 }
	 //search a key 
	 //no of compares = 1+ depth of node
	 public Value get(Key key)
	 {
		 Node x = root;
		 //start at the root and x is the pointer to the current node as we move down the tree
		 while (x != null)
		 {
			 int cmp = key.compareTo(x.key);
			 if (cmp < 0) x = x.left;
			 else if (cmp > 0) x = x.right;
			 else
			 if (cmp == 0)
			 return x.val;
		 }
		 return null;//not in our symbol
	 }
//	 public void delete(Key key)
//	 {
//	 /* see next slides */
//	 }
//	 public Iterable<Key> iterator()
//	 {
//	 /* see next slides */
//	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
