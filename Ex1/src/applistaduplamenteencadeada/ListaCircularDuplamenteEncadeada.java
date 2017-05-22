package applistaduplamenteencadeada;

public class ListaCircularDuplamenteEncadeada {
    
    No inicio;
    
    public ListaCircularDuplamenteEncadeada()
    {
        inicio = null;
    }
    
    public void addAt(int pos, int dado) {
        // Caso de erro
        if(pos > size()) {
            System.out.println("Erro - posição inválida");
        }
        // Caso A do slide
        else if(inicio == null) {
            No novoNo = new No(dado);
            novoNo.ant = novoNo;
            novoNo.next = novoNo;
            inicio = novoNo;
        }
        // Caso B do slide
        else if(pos == 0) {
            No novoNo = new No(dado);
            novoNo.ant = inicio.ant;
            novoNo.next = inicio;
            No anterior = inicio.ant;
            anterior.next = novoNo;
            inicio.ant = novoNo;
            inicio = novoNo;
        }
        // Caso C do slide
        else {
            No novoNo = new No(dado);
            No atual = inicio;
            for (int i = 0; i < pos-1; i++) {
                atual = atual.next;
            }
            No proximo = atual.next;
            novoNo.next = proximo;
            novoNo.ant = atual;
            atual.next = novoNo;
            proximo.ant = novoNo;
        }
    }
    
    public int removeAt(int pos) {
        if(inicio == null || pos >= this.size()) {
            System.out.println("Erro");
            return -1;
        }
        else if(pos == 0 && size() == 1) {
            int dado = inicio.dd;
            inicio = null;
            return dado;
        }
        else if (pos == 0) {
            int dado = inicio.dd;
            No anterior = inicio.ant;
            inicio = inicio.next;
            inicio.ant = anterior;
            anterior.next = inicio;
            return dado;
        }
        else {
            No atual = inicio;
            int cont = 0;
            while(cont < pos) {
                atual = atual.next;
                cont++;
            }
            int dado = atual.dd;
            No anterior = atual.ant;
            No proximo = atual.next;
            anterior.next = atual.next;
            proximo.ant = atual.ant;
            return dado;
        }
    }
    
    public void set(int novoValor, int pos)
    {
        if(isEmpty() || pos >= size()) {
            System.out.println("Erro");
            return;
        }
        No atual = inicio;
        for (int cont = 0; cont < pos; cont++) {
            atual = atual.next;
        }
        atual.dd = novoValor;
    }
    
    public int get(int pos)
    {
        if(isEmpty() || pos >= size()) {
            System.out.println("Erro");
            return -1;
        }
        No atual = inicio;
        for (int cont = 0; cont < pos; cont++) {
            atual = atual.next;
        }
        return atual.dd;
    }
    
    public int size() {
        if(inicio == null) {
            return 0;
        }
        else {
            No atual = inicio.next;
            int cont = 1;
            while (atual != inicio) {
                atual = atual.next;
                cont++;
            }
            return cont;
        }
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }
    
    public void imprimir() {
        if(inicio != null) {
            System.out.print(inicio.dd + " ");
            No atual = inicio.next;
            // Erro estava no imprimir - Estava atualizando
            // o valor de atual antes de imprimir o dado,
            // por isso apareceu errado na main
            while (atual != inicio) {
                System.out.print(atual.dd + " ");
                atual = atual.next;
            }
            System.out.println("");
        }
    }
    
}
