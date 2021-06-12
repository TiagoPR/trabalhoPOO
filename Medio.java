
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
    public Medio(String umNome, int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse,
                 int valorRecuperacaoBola)
    {
        super(umNome, valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
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
     * Método que calcula o valor correspondente à habilidade ("Habilidade") de objetos da classe Medio, tendo em conta as especificidades desta.
     */
    public int calculaHabilidade()
    {
        double valor = this.getRecuperacaoBola() * 0.30 + this.getCapacidadePasse() * 0.15
                + this.getDestreza() * 0.10 + this.getImpulsao() * 0.10 + this.getRemate() * 0.10
                + this.getJogoCabeca() * 0.10 + this.getResistencia() * 0.10 + this.getVelocidade() * 0.05;

        return (int) valor;
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
