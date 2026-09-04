import static java.lang.System.*;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 15);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = forca + 5; // golpe de espada com bônus fixo
        System.out.println(nome + " desfere um golpe de espada em " + alvo.getNome() + "!");
        alvo.receberDano(dano);
    }
}
