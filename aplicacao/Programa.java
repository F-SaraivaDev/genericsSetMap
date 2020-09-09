package aplicacao;

import java.util.Set;
import java.util.TreeSet;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Set<Produto> set = new TreeSet<>();
		
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tv", 990.9));
		set.add(new Produto("Iphone", 3000.0));
		
		for(Produto p : set){
			System.out.println(p);
		}
		
	}

}
