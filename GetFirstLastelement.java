import java.util.LinkedList;

public class GetFirstLastelement {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("Pink");
		L.add("orange");
		
		System.out.println("Original linked list:"+L);
		
		System.out.println();
		System.out.println("First Element is:"+L.getFirst());
		System.out.println("Last Element is:"+L.getLast());
		
		
	}

}

//Sample Output:Original linked list:[Red, Green, Black, Pink, orange] 
//First Element is: Red
//Last Element is: orange