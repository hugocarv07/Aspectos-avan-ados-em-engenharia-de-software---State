package padroesprojeto.state.hospital;

public class Internacao {

    private String nomePaciente;
    private InternacaoEstado estado;

    public Internacao() {
        this.estado = InternacaoEstadoInternado.getInstance();
    }

    public void setEstado(InternacaoEstado estado) {
        this.estado = estado;
    }

    public InternacaoEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public boolean internar() {
        return estado.internar(this);
    }

    public boolean darAltaMedica() {
        return estado.darAltaMedica(this);
    }

    public boolean colocarEmObservacao() {
        return estado.colocarEmObservacao(this);
    }

    public boolean darAltaAdministrativa() {
        return estado.darAltaAdministrativa(this);
    }

    public boolean registrarEvasao() {
        return estado.registrarEvasao(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }
}
