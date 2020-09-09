package aplicacao;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetExemplo {
	
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Notebook");
		set.add("Tablet");
		set.add("Iphone");
		
		//System.out.println(set.contains("Iphone"));
		
		set.removeIf(x -> x.charAt(0) == 'I');
		
		for(String s : set){
			System.out.println(s);
		}
	}

}
