import java.util.LinkedList;

public class ReplaceElements {

	public static void main(String[] args) {
		
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list:"+L);
		
		L.remove(1);
		L.add(1, "Orange");
		
		System.out.println();
		System.out.println("The value of second element changed.");
		
		System.out.println();
		System.out.println("New linked list: "+L);
	}

}
//Sample Output:Original linked list: [Red, Green, Black, White, Pink]
//The value of second element changed.
//New linked list: [Red, Orange, Black, White, Pink]