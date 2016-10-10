import java.util.ArrayList;
import java.util.Scanner;

public class Teclado {
	ArrayList<String> listaDeChaves;
    boolean escolhido;
    Scanner scan = new Scanner(System.in);

    
    public Teclado() {
        listaDeChaves = new ArrayList<String>();
    }

    public void chaveEscolhida(String chave) {
        // Adiciona e armazena a letra inserida dentro da ArrayList
        listaDeChaves.add(chave);
    }

    public boolean foiEscolhido(String chave) {
        // Vê se a letra escolhida já foi introduzida anteriormente ou não
        escolhido = listaDeChaves.contains(chave);
        return escolhido;
    }

    public char getNovaLetra() {
        
        char a;
        boolean escolhido;
        String tentativa; // usado para converter o char a numa String 

        do { //tivemos que ir pesquisar à net para saber como utilizar esta fórmula
            System.out.println("Introduza uma letra:");
            a = scan.next().charAt(0);
            tentativa = "" + a;
            escolhido = foiEscolhido(tentativa);
            if (!escolhido) {
                chaveEscolhida(tentativa);
            } else {
                System.out.println("Tu já utilizaste essa letra. Tenta outra vez.");

            }

        } while (escolhido); // Repetimos o processo até acabarem as tentativas

        return a;
    }
}
