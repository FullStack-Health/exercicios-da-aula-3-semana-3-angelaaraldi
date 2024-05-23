import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador jogador1 = new Jogador();
        jogadores.add(jogador1);
        Jogador jogador2 = new Jogador();
        jogadores.add(jogador2);
        Jogador jogador3 = new Jogador();
        jogadores.add(jogador3);
        Jogador jogador4 = new Jogador();
        jogadores.add(jogador4);
        Jogador jogador5 = new Jogador();
        jogadores.add(jogador5);
        Jogador jogador6 = new Jogador();
        jogadores.add(jogador6);
        Jogador jogador7 = new Jogador();
        jogadores.add(jogador7);
        Jogador jogador8 = new Jogador();
        jogadores.add(jogador8);
        Jogador jogador9 = new Jogador();
        jogadores.add(jogador9);
        Jogador jogador10 = new Jogador();
        jogadores.add(jogador10);
        Jogador jogador11 = new Jogador();
        jogadores.add(jogador11);
        System.out.println("JOGADORES CADASTRADOS");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.posicao + ": " + jogador.numero + " - " + jogador.nome + " (" + jogador.apelido + ")" + " - " + jogador.dataNascimento + " CONDIÇÃO: " + (jogador.verificarCondicaoDeJogo() ? "TÁ PRA JOGO" : "SUSPENSO"));
        }
    }
}
