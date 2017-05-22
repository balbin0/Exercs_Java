package Ex4;

public class Pessoa {

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    String nome;
    int idade;
    String endereco;
    
    @Override
    public String toString()
    {
        return nome + ", " + idade + ", " + endereco + "\n";
    }
    
}
