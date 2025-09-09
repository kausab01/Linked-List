import java.util.LinkedList;

public class retrieveElement {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list:"+L);
		
		System.out.println("First element in the list: "+L.peekFirst());
		
		
		System.out.println();
		System.out.println("Original linked list: "+L);

		

	}

}

//Sample Output:Original linked list: [Red, Green, Black, White, Pink] 
//First element in the list: Red 
//Original linked list: [Red, Green, Black, White, Pink]