
public class Avancado extends Jogador
{
    private int desmarcacao;
    
    /**
     * Construtor por omissão para objetos da classe Avancado.
     */
    public Avancado()
    {
        super();
        this.desmarcacao = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Avancado.
     */
    public Avancado(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse, int valorDesmarcacao)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.desmarcacao = valorDesmarcacao;
    }
    
    /**
     * Construtor de cópia para objetos da classe Avancado.
     */
    public Avancado(Avancado av)
    {
        super(av);
        this.desmarcacao = av.getDesmarcacao();
    }

    /**
     * Getter para a variável desmarcacao ("Desmarcação") de objetos da classe Avancado.
     */
    public int getDesmarcacao()
    {
        return this.desmarcacao;
    }
    
    /**
     * Setter para a variável desmarcacao ("Desmarcação") de objetos da classe Avancado.
     */
    public void setDesmarcacao(int novaDesmarcacao)
    {
        this.desmarcacao = novaDesmarcacao;
    }

    public int calculaHabilidade()
    {
        double valor =  this.getDesmarcacao() * 0.30 + this.getCapacidadePasse() * 0.10
                + this.getDestreza() * 0.10 + this.getImpulsao() * 0.10 + this.getRemate() * 0.10
                + this.getJogoCabeca() * 0.10 + this.getResistencia() * 0.10 + this.getVelocidade() * 0.10;

        return (int) valor;
    }
    
    /**
     * Método clone para objetos da classe Avancado.
     */
    public Avancado clone()
    {
        return new Avancado(this);
    }
    
    /**
     * Método equals para objetos da classe Avancado.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Avancado av = (Avancado) o;

        return super.equals(av) && this.desmarcacao == av.getDesmarcacao();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Avancado.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Desmarcação: ");
        sb.append(this.getDesmarcacao() + "\n");

        return sb.toString();
    }
    
}
