package RespostasPraticas;

public class Main {
    public static void main(String[] args) {
           Temporada t = new Temporada(2026, "Isabella Faria", 2, true);
        t.iniciarTemporada();
        t.exibirInformacoes();

        // Robôs
        Robo r = new Robo("Bob", 5.3f, 10.0f, true);
        Robo r2 = new Robo("Patrick", 6.7f, 10.f, true);

        // Programadores
        Programador p = new Programador("Vini", 15, null, "Java");
        Programador p2 = new Programador("Marta", 16, null, "Java");

        // Mecânicos
        Mecanico m = new Mecanico("Endrick", 15, null, "Motor e transmissão");
        Mecanico m2 = new Mecanico("Poliana", 17, null, "Eletrônica e Injeção Eletrônica");
        
        System.out.print("\n--- Dados da equipe: ---");
        p.exibirInformacoes();
        p2.exibirInformacoes();

        m.exibirInformacoes();
        m2.exibirInformacoes();

        System.out.print("\n--- Dados dos robôs: ---");
        r.exibirInformacoes();
        r2.exibirInformacoes();
    }
}
