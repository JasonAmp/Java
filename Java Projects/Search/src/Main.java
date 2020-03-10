
public class Main {


	public static void main(String[] args) {
		Array array = new Array();

		array.Push("Hi",0);
		array.Push("dhsjd",1);
		array.Push("fgf",2);
		array.Push("fgf",3);
		array.Push("ddd",4);
		array.Print();
		
		System.out.print("Found = ");
		System.out.print(array.Search("hj"));
	}

}
