package Ex4;

public class Ex4 {

    public static void main(String[] args) {
        
        ListaOrdenada lista = new ListaOrdenada();
        
        Pessoa p1 = new Pessoa("Jose", 15, "Av. Paulista, 900");
        lista.add(p1);
        lista.imprimir();
        
        System.out.println("*********");
        
        Pessoa p2 = new Pessoa("Maria", 25, "Av. Faria Lima, 314");
        lista.add(p2);
        lista.imprimir();
        
        System.out.println("*********");
        
        Pessoa p3 = new Pessoa("Ana", 19, "Av. Dr. Arnaldo, 150");
        lista.add(p3);
        lista.imprimir();
        
        System.out.println("*********");
        
        Pessoa p4 = new Pessoa("Pedro", 17, "Av. JK, 1397");
        lista.add(p4);
        lista.imprimir();
        
        System.out.println("*********");
        
        Pessoa p5 = new Pessoa("Julia", 10, "Av. Tiradentes, 177");
        lista.add(p5);
        lista.imprimir();
        
        System.out.println("*********\n");
        
        System.out.println("***\n" + lista.removeAt(0)+ "****");
        lista.imprimir();
        
    }
    
}
