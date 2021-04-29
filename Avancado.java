
public class Avancado extends Jogador
{
    private int z;
    
    /**
     * Construtor por omissão para objetos da classe Avancado.
     */
    public Avancado()
    {
        super();
        this.z = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Avancado.
     */
    public Avancado(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse, int valorz)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.z = valorz;
    }
    
    /**
     * Construtor de cópia para objetos da classe Avancado.
     */
    public Avancado(Avancado av)
    {
        super(av);
        this.z = av.getz();
    }

    /**
     * Getter para a variável  ("") de objetos da classe Avancado.
     */
    public int getz()
    {
        return this.z;
    }
    
    /**
     * Setter para a variável  ("") de objetos da classe Avancado.
     */
    public void setz(int novaz)
    {
        this.z = novaz;
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

        return super.equals(av) && this.z == av.getz();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Avancado.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("z: ");
        sb.append(this.getz() + "\n");

        return sb.toString();
    }
    
}
