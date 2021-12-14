package mision_tic_2022_colecciones_listas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Mision_Tic_2022_Colecciones_Listas {
    public static void main(String[] args) {
        List ejemploObjetoListaLink = new LinkedList();
        ejemploObjetoListaLink.add("Elemento_1");
        ejemploObjetoListaLink.add("Elemento_2");
        ejemploObjetoListaLink.add("Elemento_3");
        ejemploObjetoListaLink.add("Elemento_3");
        System.out.println("Lista Linked list");
        mostrar_elementos (ejemploObjetoListaLink);
        
        List ejemploObjetoListaArray = new ArrayList();
        ejemploObjetoListaArray.add("Elemento_1");
        ejemploObjetoListaArray.add("Elemento_2");
        ejemploObjetoListaArray.add("Elemento_3");
        ejemploObjetoListaArray.add("Elemento_3");
        System.out.println("Lista array list");
        mostrar_elementos (ejemploObjetoListaArray);
        
    }
        public static void mostrar_elementos(Collection coll){
            Iterator iter = coll.iterator();
            while (iter.hasNext()){
                String elem = (String) iter.next();
                System.out.println(elem+" ");
            }
            System.out.println();
        }
}
