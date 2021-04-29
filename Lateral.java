
public class Lateral extends Jogador
{
    private int cruzamento;
    
    /**
     * Construtor por omissão para objetos da classe Lateral.
     */
    public Lateral()
    {
        super();
        this.cruzamento = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Lateral.
     */
    public Lateral(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse, int valorCruzamento)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.cruzamento = valorCruzamento;
    }
    
    /**
     * Construtor de cópia para objetos da classe Lateral.
     */
    public Lateral(Lateral lt)
    {
        super(lt);
        this.cruzamento = lt.getCruzamento();
    }

    /**
     * Getter para a variável cruzamento ("Cruzamento") de objetos da classe Lateral.
     */
    public int getCruzamento()
    {
        return this.cruzamento;
    }
    
    /**
     * Setter para a variável cruzamento ("Cruzamento") de objetos da classe Lateral.
     */
    public void setCruzamento(int novoCruzamento)
    {
        this.cruzamento = novoCruzamento;
    }
    
    /**
     * Método clone para objetos da classe Lateral.
     */
    public Lateral clone()
    {
        return new Lateral(this);
    }
    
    /**
     * Método equals para objetos da classe Lateral.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Lateral lt = (Lateral) o;

        return super.equals(lt) && this.cruzamento == lt.getCruzamento();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Lateral.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Cruzamento: ");
        sb.append(this.getCruzamento() + "\n");

        return sb.toString();
    }
    
}
