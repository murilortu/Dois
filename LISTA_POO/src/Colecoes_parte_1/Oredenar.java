package Colecoes_parte_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Oredenar {

	public static void main(String[] args) {
		
		 List<String> nomes = new ArrayList<>();     
	        
	        nomes.add("lucas");
	        nomes.add("Wosley");
	        nomes.add("Maria");
	        nomes.add("Alice");
	        nomes.add("Kaio");
	        
	        Collections.sort(nomes);
	        
	        for (String nome : nomes) {
	            System.out.println(nome);
	        }
	}

}
