package apppilhadinamica;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        
        PilhaDinamica p = new PilhaDinamica();
                Scanner scan = new Scanner(System.in);
                String frase = scan.nextLine();
                String saida = "";
        
        for(int i = 0; i < frase.length(); i++){
            System.out.println(saida);
            char c = frase.charAt(i);
            
            if(isVogal(c)) {
                while(c != ' ') {
                    p.push(c);
                    i++;
                    if(i == frase.length())
                        break;
                    else
                        c = frase.charAt(i);
                }
                while(!p.isEmpty()) {
                    saida += p.pop();
                }
                if(c == ' ') {
                    saida += c;
                }
            }
            else if (c == ' ') {
                saida += c;
            }
            else {
                while(c != ' ' && i < frase.length()) {
                    saida += c;
                    i++;
                    if(i == frase.length())
                        break;
                    else
                        c = frase.charAt(i);
                }
                if(c == ' ') {
                    saida += c;
                }
            }
        }
        System.out.println(saida);
    }
    
    public static boolean isVogal(char c)    {
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }
}
