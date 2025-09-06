import java.util.LinkedList;

public class iterateElements {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		L.add("Yellow");
		
		for(int i=0;i<L.size();i++)
		{
			System.out.println(L.get(i));
		}

	}

}
