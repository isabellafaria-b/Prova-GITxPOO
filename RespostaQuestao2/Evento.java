package RespostaQuestao2;

public class Evento {
    private String nomeEvento;
    private String local;
    private String data;
    private float pontuacaoObtida;

    // Construtor
    public Evento(String nomeEvento, String local, String data) {
        this.nomeEvento = nomeEvento;
        this.local = local;
        this.data = data;
        this.pontuacaoObtida = 0f;
    }

    public void exibirInformacoes() {
       System.out.println("\nInformações do evento");
       System.out.println("{ nome: " + this.getNomeEvento());
       System.out.println("local: " + this.getLocal());
       System.out.println("data: " + this.getData() + " }");
       System.out.println("{ pontuação obtida durante o evento: " + this.getPontuacaoObtida()  + " }");

       }

    // Getters e Setters
    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPontuacaoObtida() {
        return pontuacaoObtida;
    }

    public void setPontuacaoObtida(float pontuacaoObtida) {
        this.pontuacaoObtida = pontuacaoObtida;
    }
}
