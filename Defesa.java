
public class Defesa extends Jogador
{
    private int marcacao;

    /**
     * Construtor por omissão para objetos da classe Defesa.
     */
    public Defesa()
    {
        super();
        this.marcacao = 0;
    }

    /**
     * Construtor parametrizado para objetos da classe Defesa.
     */
    public Defesa(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse, int valorMarcacao)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.marcacao = valorMarcacao;
    }

    /**
     * Construtor de cópia para objetos da classe Defesa.
     */
    public Defesa(Defesa df)
    {
        super(df);
        this.marcacao = df.getMarcacao();
    }

    /**
     * Getter para a variável marcacao ("Marcação") de objetos da classe Defesa.
     */
    public int getMarcacao()
    {
        return this.marcacao;
    }

    /**
     * Setter para a variável marcacao ("Marcação") de objetos da classe Defesa.
     */
    public void setMarcacao(int novaMarcacao)
    {
        this.marcacao = novaMarcacao;
    }

    /**
     * Método que calcula o valor correspondente à habilidade ("Habilidade") de objetos da classe Defesa, tendo em conta as especificidades desta.
     */
    public int calculaHabilidade()
    {
        double valor = this.getMarcacao() * 0.30 + this.getCapacidadePasse() * 0.10
                + this.getDestreza() * 0.10 + this.getImpulsao() * 0.10 + this.getRemate() * 0.10
                + this.getJogoCabeca() * 0.10 + this.getResistencia() * 0.10 + this.getVelocidade() * 0.10;

        return (int) valor;
    }
    
    /**
     * Método clone para objetos da classe Defesa.
     */
    public Defesa clone()
    {
        return new Defesa(this);
    }
    
    /**
     * Método equals para objetos da classe Defesa.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Defesa df = (Defesa) o;

        return super.equals(df) && this.marcacao == df.getMarcacao();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Defesa.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Marcação: ");
        sb.append(this.getMarcacao() + "\n");

        return sb.toString();
    }
    
}
