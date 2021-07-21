package exercicioRelampagoSupresa;

public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String estadoDaCidadeFilial()
    {
        return cidade.nomeDoEstado();
    }

    public String getNomeDiretorDaEmpresa()
    {
        return empresa.getNomeDiretor();
    }
}
