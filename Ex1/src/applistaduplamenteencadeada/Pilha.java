package applistaduplamenteencadeada;

public class Pilha {
    
    private ListaCircularDuplamenteEncadeada lista = new ListaCircularDuplamenteEncadeada();
    
    public Pilha() {}
    
    public int pop()
    {
        return this.lista.removeAt(this.size()-1);
    }
    
    public void push(int dado)
    {
        this.lista.addAt(this.size(), dado);
    }
    
    public int size()
    {
        return this.lista.size();
    }
    
    public boolean isEmpty()
    {
        return this.lista.isEmpty();
    }
    
    public int top()
    {
        return this.lista.get(this.size() - 1);
    }
    
    public void imprimir()
    {
        for (int i = this.size()-1; i >= 0; i--)
        {
            System.out.print(this.lista.get(i) + " ");
        }
        System.out.println("");
    }

    
}
