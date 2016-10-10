
public class JogoDaForca {
	public JogoDaForca() {

        int totalErros = 0;
        PalavraSecreta palavra = new PalavraSecreta();
        Teclado input = new Teclado();

        while (totalErros < 5 && !palavra.resolvido()) {

            System.out.println(palavra);
            char c = input.getNovaLetra();

            if (!palavra.update(c)) {
                totalErros++;
                if (totalErros == 1) { //Usado para introduzir o desenho da forca e o aviso de erro na consola
                    System.out.println("         ");
                    System.out.println("         ");
                    System.out.println("         ");
                    System.out.println("         ");
                    System.out.println("         ");
                    System.out.println("         ");
                    System.out.println("_________\n");
                    System.out.println("1 erro, erra mais 4 vezes e perdes.\n");
                } else if (totalErros == 2) {
                    System.out.println("         ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|________\n");
                    System.out.println("2 erros, erra mais 3 vezes e perdes.\n");
                } else if (totalErros == 3) {
                    System.out.println("_________");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|________\n");
                    System.out.println("3 erros, erra mais 2 vezes e perdes.\n");
                } else if (totalErros == 4) {
                    System.out.println("_________");
                    System.out.println("|     |  ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|        ");
                    System.out.println("|________\n");
                    System.out.println("4 erros, erra mais 1 vezes e perdes.\n");
                } else if (totalErros == 5) {
                    System.out.println("_________");
                    System.out.println("|     |  ");
                    System.out.println("|     O  ");
                    System.out.println("|    _|_ ");
                    System.out.println("|   | | |");
                    System.out.println("|    _|_ ");
                    System.out.println("|________ \n");
                    System.out.println("5 erros, acabaram as 5 tentativas.\n");
                }
            }
        }

        //usado no final do programa
        if (palavra.resolvido()) { //completou a palavra
            System.out.println(palavra);
            System.out.println("Parabéns! Estou orgulhoso de ti! :D");
        } else { //atingio o limite de erros
            System.out.println("Fizeste demasiados erros. O jogo acabou. :(");
        }

    }
}
