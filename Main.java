public class Main {
    public static void main(String[] args) {
        Participante p1 = new Participante("Ana", "ana@email.com", "Cosplay");
        Participante p2 = new Participante("Bruno", "bruno@email.com", "Campeonato");
        Participante p3 = new Participante("Carla", "carla@email.com", "Palestra");

        System.out.println("=== Cadastro de Participantes ===");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}

class Participante {
    private String nome;
    private String email;
    private String tipoParticipacao;

    public Participante(String nome, String email, String tipoParticipacao) {
        this.nome = nome;
        this.email = email;
        this.tipoParticipacao = tipoParticipacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Tipo de Participação: " + tipoParticipacao);
        System.out.println("------------------------------");
    }
}
