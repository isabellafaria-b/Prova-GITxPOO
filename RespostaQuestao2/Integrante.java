package RespostaQuestao2;

public abstract class Integrante implements Notificavel {
    // Atributos
    protected String nome;
    protected int idade;
    protected String cargo;

    // Construtor
    public Integrante(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    // Metodo
    public abstract void exibirInformacoes();

    public void notificar(String mensagem){
        System.out.println("Olá, " + this.getNome() + " uma reunião foi marcada para amanhã às 18hrs..");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}