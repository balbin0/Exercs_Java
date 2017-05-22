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
public class No {
    
    public Pessoa dd;
    public No next;
    
    public No(Pessoa dado){
        dd = dado;
        next = null;
    }
    
    public void show()
    {
        System.out.println(dd);
    }
    
}
