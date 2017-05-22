package apppilhadinamica;

public class No {
    
    public char dado;             
    public No next;              

    public No(char dd) { 
        dado = dd;
        next = null;
    }

    public void imprime() { 
        System.out.println(dado); 
    }

}
