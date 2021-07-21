package exercicioRelampagoSupresa;

public class Cidade {

    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String nomeDoEstado()
    {
        return estado.getNomeDoEstado();
    }
}
