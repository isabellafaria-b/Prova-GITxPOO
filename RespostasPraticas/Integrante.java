package RespostasPraticas;

public class Integrante {
    // Atributos
    private String nome;
    private int idade;
    public String cargo;

    // Construtor
    public Integrante(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    // Metodo
    public void exibirInformacoes() {
        System.out.println("Informações de integrante");
        System.out.println("nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
        System.out.println("cargo: " + this.getCargo());
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
