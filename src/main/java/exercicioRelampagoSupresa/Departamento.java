package exercicioRelampagoSupresa;

public class Departamento {

    private Empresa empresa;
    private Funcionario chefe;
    private Pais PaisDeAlocacao;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public Pais getPaisDeAlocacao() {
        return PaisDeAlocacao;
    }

    public void setPaisDeAlocacao(Pais paisDeAlocacao) {
        PaisDeAlocacao = paisDeAlocacao;
    }

    public String getNomePaisDeAlocacao()
    {
        return PaisDeAlocacao.getNomeDoPais();
    }

    public String EscolaridadeChefe()
    {
        return chefe.getNivelEscolaridadeFuncionario();
    }
}
