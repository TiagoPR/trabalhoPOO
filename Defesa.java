
public class Defesa extends Jogador
{
    private int x;
    
    /**
     * Construtor por omissão para objetos da classe Defesa.
     */
    public Defesa()
    {
        super();
        this.x = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Defesa.
     */
    public Defesa(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse, int valorx)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImpulsao, valorJogoCabeca, valorRemate, valorCapacidadePasse);
        this.x = valorx;
    }
    
    /**
     * Construtor de cópia para objetos da classe Defesa.
     */
    public Defesa(Defesa df)
    {
        super(df);
        this.x = df.getx();
    }

    /**
     * Getter para a variável  ("") de objetos da classe Defesa.
     */
    public int getx()
    {
        return this.x;
    }

    /**
     * Setter para a variável  ("") de objetos da classe Defesa.
     */
    public void setx(int novax)
    {
        this.x = novax;
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

        return super.equals(df) && this.x == df.getx();
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Defesa.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("x: ");
        sb.append(this.getx() + "\n");

        return sb.toString();
    }
    
}
