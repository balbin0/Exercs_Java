/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filadinamica;

/**
 *
 * @author alvaro
 */
public class FilaDin {
    
    No inicio;
    No fim;
    
    public FilaDin()
    {
        inicio = fim = null;
    }
    
    public void enqueue(Pessoa novoDado)
    {
        No novoNo = new No(novoDado);
        
        if(inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        }
        else {
            fim.next = novoNo;
            fim = novoNo;
        }
    }
    
    public Pessoa dequeue()
    {
        if(inicio == null) {
            System.out.println("Fila vazia");
            return null;
        }
        Pessoa temp = inicio.dd;
        inicio = inicio.next;
        
        if(inicio == null)
            fim = null;
        
        return temp;
    }
    
    public Pessoa peek()
    {
        if(inicio == null){
            System.out.println("Fila Vazia");
            return null;
        }
        else
            return inicio.dd;
    }
    
    public boolean isEmpty()
    {
        return inicio == null;
    }
    
    public int size()
    {
        int cont = 0;
        No atual = inicio;
        while(atual != null) {
            cont++;
            atual = atual.next;
        }
        return cont;
    }
    
    public void show()
    {
        if(inicio == null)
            System.out.println("Fila vazia");
        else {
            No atual = inicio;
            while(atual != null) {
                atual.show();
                atual = atual.next;
            }
            System.out.println("");
        }
    }
}
