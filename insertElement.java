import java.util.LinkedList;

public class insertElement {

	public static void main(String[] args) {
		
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list:");
		System.out.println("Let add the Yellow color after the Red Color:"+L);
		
		L.add(1,"Yellow");
		
		System.out.println();
		System.out.println("The linked list:"+L);

	}

}
