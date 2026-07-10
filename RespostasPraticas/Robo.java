package RespostasPraticas;

public class Robo {
    // Atributos
    private String nome;
    private float peso;
    private float velocidade;
    private boolean funcional;

    // Construtor
    public Robo(String nome, float peso, float velocidade, boolean funcional) {
        this.nome = nome;
        this.peso = peso;
        this.velocidade = velocidade;
        this.funcional = funcional;
    }
    
    // Metodos
    public void ligar(){
        this.setVelocidade(5.0f);
    }

    public void desligar(){
        this.setVelocidade(0.0f);
    }

    public void exibirInformacoes() {
        System.out.println("\nInformações de robô");
        System.out.println("{ nome: " + this.getNome());
        System.out.println("peso: " + this.getPeso());
        System.out.println("velocidade: " + this.getVelocidade());
        System.out.println("é funcional? " + this.getFuncional() + " }");
    }
    

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
    
}
