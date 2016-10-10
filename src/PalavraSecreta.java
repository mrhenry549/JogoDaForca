
public class PalavraSecreta {
	String visor, escolhePalavra;

    public PalavraSecreta() {

        String[] listaPalavras = {"telemovel", "gravity falls", "computador",
            "bola", "estados unidos da america", "atec"};

        int rand;
        rand = (int) (Math.random() * listaPalavras.length);
        escolhePalavra = listaPalavras[rand];
        visor = "";

        for (int i = 0; i < escolhePalavra.length(); i++) { //troca a(s) palavra(s) da string por _ e (espaço)
            char c = escolhePalavra.charAt(i);

            if (c == ' ') {
                visor += c;
            } else {
                visor += '_';
            }
        }
    }

    public String toString() {
        return visor;
    }

    public boolean update(char c) {
        char[] escolhePalavraArray = new char[escolhePalavra.length()];
        char[] arrayVisivel = new char[escolhePalavra.length()];
        String s = "";
        boolean conter = false;

        for (int i = 0; i < escolhePalavra.length(); i++) {
            //Estamos a transformar a String escolhePalavra num Array
            escolhePalavraArray[i] = escolhePalavra.charAt(i);
            arrayVisivel[i] = visor.charAt(i);
        }

        for (int k = 0; k < escolhePalavra.length(); k++) {
            //Estamos a atualizar o Array visivel que estava vasio
            if (escolhePalavraArray[k] == c) {
                arrayVisivel[k] = c;
                conter = true;
            }
        }

        for (int m = 0; m < escolhePalavra.length(); m++) {
            //Estamos a mudar uma Array visivel numa String visivel
            s = s + arrayVisivel[m];
        }

        visor = s;

        return conter;
    }

    public boolean resolvido() {
        //Este é o métudo para ver se a palavra secreta foi resolvida
        return escolhePalavra.equalsIgnoreCase(visor);
    }
}
