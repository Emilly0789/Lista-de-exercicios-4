import java.util.ArrayList;
import java.util.List;

public class CombateSimulacao {
    public static void main(String[] args) {
        List<Personagem> equipe = new ArrayList<>();
        equipe.add(new Guerreiro("Thorin"));
        equipe.add(new Mago("Elowen"));
        equipe.add(new Arqueiro("Sylas"));

        Personagem inimigo = new Guerreiro("Orc Brutal");

        System.out.println("   INÍCIO DO COMBATE   ");
        System.out.println("Inimigo: " + inimigo.getNome() + "\n");

        int turno = 1;
        for (Personagem heroi : equipe) {
            if (!inimigo.estaVivo()) break;

            System.out.println("   Turno " + turno + "    ");
            heroi.atacar(inimigo);
            System.out.println();
            turno++;
        }

        System.out.println("    FIM DO COMBATE    ");
        if (inimigo.estaVivo()) {
            System.out.println(inimigo.getNome() + " sobreviveu com " + inimigo.getVida() + " de vida.");
        } else {
            System.out.println(inimigo.getNome() + " foi derrotado!");
        }
    }
}
