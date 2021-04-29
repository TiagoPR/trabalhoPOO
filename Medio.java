
public class Medio extends Jogador
{
    private int recuperacaoBola;
    
    /**
     * Construtor por omissão para objetos da classe Medio.
     */
    public Medio()
    {
        super();
        this.recuperacaoBola = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Medio.
     */
    public Medio(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse,
                 int valorRecuperacaoBola)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.recuperacaoBola = valorRecuperacaoBola;
    }
    
    /**
     * Construtor de cópia para objetos da classe Medio.
     */
    public Medio(Medio md)
    {
        super(md);
        this.recuperacaoBola = md.getRecuperacaoBola();
    }

    /**
     * Getter para a variável recuperacaoBola ("Recuperação de bola") de objetos da classe Medio.
     */
    public int getRecuperacaoBola()
    {
        return this.recuperacaoBola;
    }

    /**
     * Setter para a variável recuperacaoBola ("Recuperação de bola") de objetos da classe Medio.
     */
    public void setRecuperacaoBola(int novaRecuperacaoBola)
    {
        this.recuperacaoBola = novaRecuperacaoBola;
    }
    
    /**
     * Método clone para objetos da classe Medio.
     */
    public Medio clone()
    {
        return new Medio(this);
    }
    
    /**
     * Método equals para objetos da classe Medio.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Medio md = (Medio) o;

        return super.equals(md) && this.recuperacaoBola == md.getRecuperacaoBola();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Medio.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Recuperação de bola: ");
        sb.append(this.getRecuperacaoBola() + "\n");

        return sb.toString();
    }
    
}
