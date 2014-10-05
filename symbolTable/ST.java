//Symbol Table Implementation 
//basic API
//key has to be comparable type and value can  be any generic type
public class ST<Key extends Comparable<Key>, Value> {
	
	ST(){
		
	}
	void put(Key key, Value val){
		
	}
	Value get(Key key){
		
	}
	void delete(Key key){
		
	}
	boolean contains(Key key){
		
	}
	boolean isEmpty(){
		
	}
	int	size(){
		
	}
	Iterable<Key> keys(){
		
	}

	//client
	public static void main(String[] args)
	{
	ST<String, Integer> st = new ST<String, Integer>();
	for (int i = 0; !StdIn.isEmpty(); i++)
	{
	String key = StdIn.readString();
	st.put(key, i);
	}
	for (String s : st.keys())
	StdOut.println(s + " " + st.get(s));
	}

}
