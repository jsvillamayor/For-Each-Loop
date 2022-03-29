import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		//String[] animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("rat");
		animals.add("dog");
				
		
		for(String i : animals) {
			System.out.println(i);
		}
		
	}

}
