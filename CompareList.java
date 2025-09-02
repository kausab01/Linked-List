import java.util.LinkedList;

public class CompareList {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("List 1:"+L);
		
		LinkedList<String> L1=new LinkedList<String>();
		
		L1.add("Red");
		L1.add("Green");
		L1.add("Black");
		L1.add("Orange");
		
		System.out.println();
		System.out.println("List 2:"+L1);
		
		LinkedList<String> yn=new LinkedList<String>();
		
		for(String comp:L)
		{
			if(L1.contains(comp))
			{
				yn.add("Yes");
			}
			else
			{
				yn.add("No");
			}
		}
		
		System.out.println();
		System.out.println("Sample Output:"+yn);

	}

}
//List1: ["Red", "Green", "Black", "White", "Pink"]
//List2: ["Red", "Green", "Black", "Orange"]
//
//Sample Output:[Yes, Yes, Yes, No, No]