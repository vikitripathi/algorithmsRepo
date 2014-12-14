//Binary Search Tree(Dynamic D.S.): Classic Data Structures to efficiently implement Symbol Table(Search, Insert, Iterate)
//use of generic key value 
//use of linked list to maintain record as per the BST requirement
/*
BST are explicit tree d.s.  based on linked list heaps are implicit tree implementation based on array
BST are binary tree which are symmetric (keys of node are such that all child to the left have smaller keys and 
all child to the right have larger keys whereas in Heaps its different) 
*/
public class BST<Key extends Comparable<Key>, Value> {
	private Node root;//root of BST , instance variable
	private class Node//inner class ??? again!
	{
		//four instance variables
		private Key key;
		private Value val;
		private Node left, right;
		private int count;//no of nodes in subtree
		public Node(Key key, Value val)
		{
			this.key = key;
			this.val = val;
		}
	}
	//count no of nodes in a tree
	public int size()
	{
	  return size(root);
	}

	 private int size(Node x)
	 {
	   if (x == null) return 0;
	   return x.count;
	 }
	 
	//Inorder traversal
	/*
	・Traverse left subtree.
	  Enqueue key.
        ・Traverse right subtree.
	*/
	//get keys in ascending order
	 public Iterable<Key> keys()
	 {
	         Queue<Key> q = new Queue<Key>(); 
		 inorder(root, q); 
		 return q;	
	 }
	private void inorder(Node x, Queue<Key> q) 
	{ 
		 if (x == null) return; 
		 inorder(x.left, q); 
		 q.enqueue(x.key); 
		 inorder(x.right, q); 
	}
	//insert
	//if key in the tree, then reset value
	//else add new node at the required place
	//client insert method!!!
	//no of compares = 1+ depth of node
	//we do it recursively for later better D.S. implementation
	 public void put(Key key, Value val)
	 {
		 root = put(root, key, val);
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
		 x.count = 1 + size(x.left) + size(x.right);
		 return x;
	 }
	 public int rank(Key key) 
        {
            return rank(key, root); 
        }
        private int rank(Key key, Node x) 
        { 
         if (x == null) return 0; 
         int cmp = key.compareTo(x.key);
         if (cmp < 0) return rank(key, x.left); 
         else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right); 
         else if (cmp == 0) return size(x.left); 
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
		 return null;//not in our symbol table
	 }
//	 public void delete(Key key)
//	 {
//	 /* see next slides */
//	 }


	//computing floor and ceil
	public Key floor(Key key)
	{ 
	 Node x = floor(root, key);
	 if (x == null) return null;
	 return x.key;
	}
	
	private Node floor(Node x, Key key)
	{ 
	 if (x == null) return null;
	 int cmp = key.compareTo(x.key);
	 if (cmp == 0) return x;
	 if (cmp < 0) return floor(x.left, key);
	 Node t = floor(x.right, key);
	 if (t != null) return t;
	 else return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
