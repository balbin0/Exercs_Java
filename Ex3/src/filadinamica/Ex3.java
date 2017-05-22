package filadinamica;

public class Ex3 {
    
    public static void main(String[] args) {
        
        FilaDin fila = new FilaDin();
        
        Pessoa p1 = new Pessoa("Jose", 15, "Av. Paulista, 900");
        fila.enqueue(p1);
        
        Pessoa p2 = new Pessoa("Maria", 19, "Av. Faria Lima, 314");
        fila.enqueue(p2);
        
        Pessoa p3 = new Pessoa("Ana", 25, "Av. Dr. Arnaldo, 150");
        fila.enqueue(p3);
        
        fila.show();
        
        System.out.println("***\n" + fila.dequeue() + "****");
        
        System.out.println("***\n" + fila.peek() + "****");
        
    }
    
}
