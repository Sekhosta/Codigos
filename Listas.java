import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		
		/*List<String> minhaLista=null;
				
		System.out.println("Bora iniciar essa lista!");
		System.out.println();
		
				minhaLista=  new ArrayList();
				
		minhaLista.add("João");
		minhaLista.add("Silfarney");
		minhaLista.add("Joatam");
		minhaLista.add("Carol Senká");
		minhaLista.add("Juju Sampaio");
		
		System.out.println(minhaLista);*/
		
		List<Integer> minhaLista2=new LinkedList<Integer>();
		minhaLista2.add(21);
		minhaLista2.add(56);
		minhaLista2.add(87);
		minhaLista2.add(2);
		minhaLista2.add(61);
		minhaLista2.add(2, 23);
		//System.out.println(minhaLista2.indexOf(6));
		//Se o índice não existe, retorna -1
		//System.out.println(minhaLista2.indexOf(61));
		
		System.out.println(minhaLista2);
	}
}
