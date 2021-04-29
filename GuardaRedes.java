
public class GuardaRedes extends Jogador
{
    private int elasticidade;
    
    /**
     * Construtor por omissão para objetos da classe GuardaRedes.
     */
    public GuardaRedes()
    {
        super();
        this.elasticidade = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe GuardaRedes.
     */
    public GuardaRedes(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse,
                       int valorElasticidade)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.elasticidade = valorElasticidade;
    }
    
    /**
     * Construtor de cópia para objetos da classe GuardaRedes.
     */
    public GuardaRedes(GuardaRedes gr)
    {
        super(gr);
        this.elasticidade = gr.getElasticidade();
    }

    /**
     * Getter para a variável elasticidade ("Elasticidade") de objetos da classe GuardaRedes.
     */
    public int getElasticidade()
    {
        return this.elasticidade;
    }

    /**
     * Setter para a variável elasticidade ("Elasticidade") de objetos da classe GuardaRedes.
     */
    public void setElasticidade(int novaElasticidade)
    {
        this.elasticidade = novaElasticidade;
    }
    
    /**
     * Método clone para objetos da classe GuardaRedes.
     */
    public GuardaRedes clone()
    {
        return new GuardaRedes(this);
    }
    
    /**
     * Método equals para objetos da classe GuardaRedes.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        GuardaRedes gr = (GuardaRedes) o;

        return super.equals(gr) && this.elasticidade == gr.getElasticidade();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe GuardaRedes.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Elasticidade: ");
        sb.append(this.getElasticidade() + "\n");

        return sb.toString();
    }
    
}