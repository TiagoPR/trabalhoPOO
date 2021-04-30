import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Equipa
{
    private String nome;
    private int habilidade;
    private Map<Integer,Jogador> plantel;
    private Map<Integer,Jogador> banco;

    /**
     * Construtor por omissão para objetos da classe Equipa
     */
    public Equipa()
    {
        this.nome = "N/A";
        this.habilidade = 0;
        plantel = new HashMap<>();
        banco = new HashMap<>();
    }
    
    /**
     * Construtor parametrizado para objetos da classe Equipa
     */
    public Equipa(String nomedaequipa, int habilidadedaequipa, Map<Integer,Jogador> nplantel, Map<Integer,Jogador> nbanco)
    {
        this.nome = nomedaequipa;
        this.habilidade = habilidadedaequipa;
        setPlantel(nplantel);
        setBanco(nbanco);
    }
    
    /**
     * Construtor de cópia para objetos da classe Equipa
     */
    public Equipa(Equipa equipa)
    {
        this.nome = equipa.getNome();
        this.habilidade = equipa.getHabilidade();
        setPlantel(equipa.getPlantel());
        setBanco(equipa.getBanco());
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

    public Map<Integer,Jogador> getPlantel()
    {
        Map<Integer,Jogador> ret = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : plantel.entrySet())
        {
            ret.put(e.getKey(), e.getValue().clone());
        }

        return ret;
    }

    public Map<Integer,Jogador> getBanco()
    {
        Map<Integer,Jogador> ret = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : banco.entrySet())
        {
            ret.put(e.getKey(), e.getValue().clone());
        }

        return ret;
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

    public void setPlantel(Map<Integer, Jogador> nplantel)
    {
        plantel = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : nplantel.entrySet())
        {
            plantel.put(e.getKey(),e.getValue());
        }
    }

    public void setBanco(Map<Integer, Jogador> nbanco)
    {
        banco = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : nbanco.entrySet())
        {
            banco.put(e.getKey(),e.getValue());
        }
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
        
        return (this.nome.equals(equipa.getNome()) && this.habilidade == equipa.getHabilidade()
                && this.plantel.equals(equipa.getPlantel()) && this.banco.equals(equipa.getBanco()));
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
        sb.append(plantel.toString()).append(banco.toString());
        
        return sb.toString();
    }
     
}

