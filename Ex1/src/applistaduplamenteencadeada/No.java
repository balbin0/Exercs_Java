package applistaduplamenteencadeada;


public class No {
    
    public int dd;
    
    No ant;
    No next;
    
    public No(int dd)
    {
        this.dd = dd;
        this.ant = null;
        this.next = null;
    }
    
}
