import java.util.LinkedList;

public class RemoveAndReturn {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list:"+L);
		
		System.out.println("Removed element: "+L.pop());
		
		
		System.out.println();
		System.out.println("Linked list after pop operation: "+L);

	}

}

//Sample Output:Original linked list: [Red, Green, Black, White, Pink]
//Removed element: Red 
//Linked list after pop operation: [Green, Black, White, Pink]