package apppilhadinamica;

public class PilhaDinamica {

    private No topo;

    public PilhaDinamica() {
        topo = null;      // Pilha vazia
    }

    public boolean isEmpty() {  // true se a lista está vazia
        return (topo == null);
    }

    public void push(char novoDado) {
        // insere no topo da pilha (empilha)

        No novoNo = new No(novoDado);

        novoNo.next = topo;  	// Deve ser inserido no topo
        topo = novoNo; 		// O novoNo se torna o topo da pilha
    }

    public char pop() {
        // remove do topo -> desempiha
        if (isEmpty()) // se estiver vazia retorna -1
        {
            return ' ';
        }

        No temp = topo;     // utilizado para retornar o dado
        topo = topo.next;   // move o topo para o prox nó
        return temp.dado;   // retorna o dado
    }

    public void imprime() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            No atual = topo;		// inicia do topo
            while (atual != null) {	// até do final
                atual.imprime();	// exibe a informação do nó
                atual = atual.next;	// move para o proximo nó
            }
        }
    }

}
