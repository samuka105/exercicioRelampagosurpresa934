package exercicioRelampagoSupresa;

public class Empresa {

    private Grupo grupo;
    private Funcionario diretor;

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomeDiretor()
    {
        return diretor.getNome();
    }

}
