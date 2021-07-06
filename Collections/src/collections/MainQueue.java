package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import model.Atendimento;
import utils.Utils;

/**
 * @author Jefferson
 *
 */
public class MainQueue {

    public static void main(String[] args) {
        filaComPrioridade();
        //filaSimples();
    }

    private static void filaComPrioridade() {
        PriorityQueue<Atendimento> queue = new PriorityQueue<>();
        print("/---------------------------------------/");
        print("ADICIONANDO ITENS NA MINHA FILA");
        for (Atendimento n : Utils.atendimento) {
            print(n.toString());
            queue.add(n);
        
        }
        print("/---------------------------------------/");
        print("IMPRIMINDO A FILA");
        while (!queue.isEmpty()) {
            print(queue.poll().toString());
       
        }
    }

    private static void filaSimples() {
        LinkedList<String> fila = new LinkedList<String>();
        print("/---------------------------------------/");
        print("ADICIONANDO ITENS NA MINHA FILA");
        for (String n : Utils.nomes) {
            print(n);
            fila.add(n);
        print("/---------------------------------------/");
        }
        print("IMPRIMINDO A FILA");
        print(fila);
        
        print("/---------------------------------------/");
        print("\nOBTEM O ELEMENTO MAS NÃO REMOVE DA FILA");
        print(fila.poll());
        print(fila.peekFirst());
        
        print("/---------------------------------------/");
        print("ANALISANDO COMO FICOU A FILA");
        print(fila);
        
        
        print("/---------------------------------------/");
        print("OBTEM O ELEMENTO E REMOVENDO DA FILA");
        print(fila.poll());
        print("/---------------------------------------/");
        print("ANALISANDO COMO FICOU A FILA");
        print(fila);
        print("----------------------------------------/");
    }
    
    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(List list) {
        for (Object i : list) {
            //indexOf mostra o indice do elemento na Coleção
            System.out.println(list.indexOf(i) + " -->" + i.toString());
        }
    }
    private static void printQueue(Queue list) {
        for (Object i : list) {
            System.out.println(i.toString());
        }
    }

}

