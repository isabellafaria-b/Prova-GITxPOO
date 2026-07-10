package RespostaQuestao2;

public class Programador extends Integrante {
    // Atributos
    private String linguagemPrincipal;

    //Construtor
    public Programador(String nome, int idade, String cargo, String lnggPrincipal) {
        super(nome, idade, cargo);
        this.linguagemPrincipal = lnggPrincipal;
    }

    // Metodos
    public void exibirInformacoes() {
        System.out.println("\nInformações de integrante");
        System.out.println("{ nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
        System.out.println("cargo: " + "Programador");
        System.out.println("Linguagem usada: " + this.getLinguagemPrincipal()  + " }");
    }

    public void notificar(String mensagem){
        System.out.println("Olá, " + this.getNome());
    }

    // Getters
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
}
