package RespostasPraticas;

public class Temporada {
    // Atributos
    protected int ano;
    protected String nomeDesafio;
    protected int qtdEventos;
    protected boolean roboPronto;

    // Construtor
    public Temporada(int ano, String nomeDesafio, int qtdEventos, boolean roboPronto) {
        this.ano = ano;
        this.nomeDesafio = nomeDesafio;
        this.qtdEventos = qtdEventos;
        this.roboPronto = roboPronto;
    }

    // Metodos
    public void iniciarTemporada() {
        System.out.println("A temporada " + this.getNomeDesafio() + " começou!");
    }

    public void finalizarRobo() {
        setRoboPronto(true);
        System.out.println("O robô ficou pronto!");
    }

    public void exibirInformacoes() {
        System.out.println("Informações de temporada");
        System.out.print("{ ano: " + ano + "  |  " + "desafio: " + nomeDesafio + "  |  ");
        System.out.print("quantidade de eventos: " + qtdEventos + " }" );
        System.out.println("\nO robô está pronto? " + roboPronto);
    }

    // Getters e Setters
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomeDesafio() {
        return nomeDesafio;
    }

    public void setNomeDesafio(String nomeDesafio) {
        this.nomeDesafio = nomeDesafio;
    }

    public int getQtdEventos() {
        return qtdEventos;
    }

    public void setQtdEventos(int qtdEventos) {
        this.qtdEventos = qtdEventos;
    }

    public boolean getRoboPronto() {
        return roboPronto;
    }

    public void setRoboPronto(boolean roboPronto) {
        this.roboPronto = roboPronto;
    }
    
}