package RespostaQuestao2;

public class Mecanico extends Integrante {
    // Atributos
    private String especialidade;

    // Construtor
    public Mecanico(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo);
        this.especialidade = especialidade;
    }
    
   // Metodos
   @Override
   public void exibirInformacoes() {
       System.out.println("\nInformações de integrante");
       System.out.println("{ nome: " + this.getNome());
       System.out.println("idade: " + this.getIdade());
       System.out.println("cargo: " + "Mecanico");
       System.out.println("Especialidade: " + this.getEspecialidade()  + " }");
   }

   public void notificar(String mensagem){
        System.out.println("Olá, " + this.getNome());
    }

    // Getter e Setter
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
