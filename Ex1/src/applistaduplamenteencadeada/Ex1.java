package applistaduplamenteencadeada;

public class Ex1 {

    public static void main(String[] args) {
        
        Pilha p = new Pilha();
        
        p.push(10);
        p.imprimir();
        System.out.println("***********");
        
        p.push(5);
        p.imprimir();
        System.out.println("***********");
        
        p.push(13);
        p.imprimir();
        System.out.println("***********");
        
        p.push(9);
        p.imprimir();
        System.out.println("***********");
        
        System.out.println(p.size());
        System.out.println("***********");
        
        System.out.println(p.top());
        System.out.println("***********");
        
        System.out.println(p.pop());
        p.imprimir();
        System.out.println("***********");
        
        System.out.println(p.pop());
        p.imprimir();
        System.out.println("***********");
        
        System.out.println(p.pop());
        p.imprimir();
        System.out.println("***********");
        
        System.out.println(p.pop());
        p.imprimir();
        System.out.println("***********");
        
        System.out.println(p.pop());
        p.imprimir();
        System.out.println("***********");

    }
    
}
