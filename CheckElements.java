import java.util.LinkedList;

public class CheckElements {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list:"+L);

		
		   System.out.println();
			if(L.contains(" Green"))
			{
				System.out.println("Color Green is present in the linked list");
			}
			else
			{
				System.out.println("Color  Green is not present in the linked list.");
			}
		
		    System.out.println();
			if(L.contains("Orange"))
			{
				System.out.println("Color Orange is present in the linked list");
			}
			else
			{
				System.out.println("Color Orange is not present in the linked list.");
			}
		
		
		
		
	}

}

//Sample Output:Original linked list: [Red, Green, Black, White, Pink]
//Color Green is present in the linked list.
//Color Orange is not present in the linked list.