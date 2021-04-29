
public class Equipa
{
    private String nome;
    private int habilidade;

    /**
     * Construtor por omissão para objetos da classe Equipa
     */
    public Equipa()
    {
        this.nome = "N/A";
        this.habilidade = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Equipa
     */
    public Equipa(String nomedaequipa, int habilidadedaequipa)
    {
        this.nome = nomedaequipa;
        this.habilidade = habilidadedaequipa;
    }
    
    /**
     * Construtor de cópia para objetos da classe Equipa
     */
    public Equipa(Equipa equipa)
    {
        this.nome = equipa.getNome();
        this.habilidade = equipa.getHabilidade();
    }
    
    /**
     * Getter para a variável nome de objetos da classe Equipa
     */
    public String getNome()
    {
        return this.nome;
    }
    
    /**
     * Getter para a variável habilidade de objetos da classe Equipa
     */
    public int getHabilidade()
    {
        return this.habilidade;
    }
    
    /**
     * Setter para a variável nome de objetos da classe Equipa
     */
    public void setNome(String novonome)
    {
        this.nome = novonome;
    }
    
    /**
     * Setter para a variável habilidade de objetos da classe Equipa
     */
    public void setHabilidade(int novahabilidade)
    {
        this.habilidade = novahabilidade;
    }
    
    /**
     * Método clone para objetos da classe Equipa
     */
    public Equipa clone()
    {
        return new Equipa(this);
    }
    
    /**
     * Método equals para objetos da classe Equipa
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        
        Equipa equipa = (Equipa) o;
        
        return (this.getNome() == equipa.getNome() && this.getHabilidade() == equipa.getHabilidade());
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Equipa
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nome da equipa: ");
        sb.append(this.getNome() + "\n");
        sb.append("Habilidade: ");
        sb.append(this.getHabilidade() + "\n");
        
        return sb.toString();
    }
     
}

