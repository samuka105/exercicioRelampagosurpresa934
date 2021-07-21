package exercicioRelampagoSupresa;

public class Funcionario {

    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;
    private String nome;

    public Funcionario(Escolaridade escolaridade, Departamento alocacao, Filial coordenacao, String nome) {
        this.escolaridade = escolaridade;
        this.alocacao = alocacao;
        this.coordenacao = coordenacao;
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelEscolaridadeFuncionario()
    {
        return escolaridade.getNivelEscolaridade();
    }

    public String EstadoDaFilialFuncionario()
    {
        return coordenacao.estadoDaCidadeFilial();
    }

    public String paisDeAlocacaoDoFuncionario()
    {
        return alocacao.getNomePaisDeAlocacao();
    }

}
