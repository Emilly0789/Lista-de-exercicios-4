public class Mago extends Personagem {
    private int mana;

    public Mago(String nome) {
        super(nome, 80, 20);
        this.mana = 50;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (mana >= 10) {
            int dano = forca + 10;
            mana -= 10;
            System.out.println(nome + " conjura uma bola de fogo em " + alvo.getNome()
                    + " (mana restante: " + mana + ")!");
            alvo.receberDano(dano);
        } else {
            int dano = forca / 2; // ataque fraco sem mana
            System.out.println(nome + " está sem mana e ataca com o cajado em " + alvo.getNome() + "!");
            alvo.receberDano(dano);
        }
    }
}
