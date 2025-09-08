import java.util.LinkedList;

public class SwapElements {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("Pink");
		L.add("orange");
		
		System.out.println("Original linked list:"+L);
		
		String swap=L.get(0);
		L.set(0, L.get(2));
		L.set(2, swap);
		
		System.out.println();
		System.out.println("The New linked list after swap: "+L);

	}

}
