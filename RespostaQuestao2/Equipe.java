package RespostaQuestao2;
import java.util.ArrayList;
import RespostaQuestao2.Integrante.*;

public class Equipe {
    // Atributos
    protected String nomeEquipe;
    public ArrayList<Integrante> integrantes;
    public ArrayList<Evento> eventos;
    public Integrante isabella;

    // Construtor
    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.integrantes = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    // Metodos
    

    public void adicionarIntegrante(Integrante integrante) {
        integrantes.add(integrante);
    }
    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void exibirIntegrantes() {
        for (Integrante integrante : integrantes) {
            System.out.println(integrante);

            // Notifica o integrante atual sobre a equipe
            integrante.notificar(nomeEquipe);
        }
    }
    public void exibirEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
}
