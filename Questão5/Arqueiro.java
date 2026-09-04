public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 100, 12);
    }

    @Override
    public void atacar(Personagem alvo) {
        boolean critico = Math.random() < 0.3; // 30% de chance de crítico
        int dano = critico ? forca * 2 : forca;
        System.out.println(nome + " atira uma flecha em " + alvo.getNome()
                + (critico ? " -- ACERTO CRÍTICO!" : "") + "!");
        alvo.receberDano(dano);
    }
}