import java.util.Date;

public class Jogador {
    int id, numero, qualidade, cartoes;
    String nome, apelido, posicao;
    Date dataNascimento;
    boolean suspenso = false;

    public Jogador() {

    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade, int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    public boolean verificarCondicaoDeJogo() {
        if (this.cartoes >= 3) {
            this.suspenso = true;
        }
        return !this.suspenso;
    }
}
