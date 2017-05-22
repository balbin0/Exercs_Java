package Ex4;

public class ListaOrdenada {
    
    private No inicio;
    private No fim;
    
    public ListaOrdenada()
    {
        this.inicio = null;
        this.fim = null;
    }
    
    public void add(Pessoa novoElemento) {
        if(isEmpty()) {
            No novoNo = new No(novoElemento);
            inicio = fim = novoNo;
        }
        else if(novoElemento.idade < inicio.dd.idade) {
            No novoNo = new No(novoElemento);
            novoNo.next = inicio;
            inicio = novoNo;
        }
        else if (fim.dd.idade <= novoElemento.idade) {
            No novoNo = new No(novoElemento);
            fim.next = novoNo;
            fim = novoNo;
        }
        else {
            No anterior = inicio;
            No atual = inicio.next;
            
            while (atual.dd.idade < novoElemento.idade) {
                atual = atual.next;
                anterior = anterior.next;
            }
            No novoNo = new No(novoElemento);
            
            novoNo.next = anterior.next;
            anterior.next = novoNo;
            
        }
    }
    
    public Pessoa removeAt(int pos) 
    {
        if(isEmpty() || pos >= size()) {
            System.out.println("Erro");
            return null;
        }
        if(inicio == fim && pos == 0) {
            Pessoa temp = inicio.dd;
            inicio = fim = null;
            return temp;
        }
        if(pos == 0 && inicio != fim) {
            Pessoa temp = inicio.dd;
            inicio = inicio.next;
            return temp;
        }
        if(pos == size()-1) {
            Pessoa temp = fim.dd;
            No anterior = inicio;
            for (int cont = 0; cont < pos-1; cont++) {
                anterior = anterior.next;
            }
            anterior.next = null;
            fim = anterior;
            return temp;
        }
        No anterior = inicio;
        No atual = inicio.next;
        for (int cont = 1; cont < pos; cont++) {
            atual = atual.next;
            anterior = anterior.next;
        }
        anterior.next = atual.next;
        return atual.dd;
    }
    
    public int size()
    {
        No atual = inicio;
        int tamanho = 0;
        while(atual != null) {
            atual = atual.next;
            tamanho++;
        }
        return tamanho;
    }
    
    public boolean isEmpty()
    {
        return inicio == null;
    }
    
    public void imprimir()
    {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dd);
            atual = atual.next;
        }
        System.out.println("");
    }
    
}