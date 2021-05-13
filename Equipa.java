import java.util.Map;
import java.util.HashMap;

public class Equipa
{
    private String nome;
    private Map<Integer,Jogador> plantel;
    private Map<Integer,Jogador> banco;

    /**
     * Construtor por omissão para objetos da classe Equipa.
     */
    public Equipa()
    {
        this.nome = "N/A";
        plantel = new HashMap<>();
        banco = new HashMap<>();
    }
    
    /**
     * Construtor parametrizado para objetos da classe Equipa.
     */
    public Equipa(String nomeEquipa, Map<Integer,Jogador> nPlantel, Map<Integer,Jogador> nBanco)
    {
        this.nome = nomeEquipa;
        setPlantel(nPlantel);
        setBanco(nBanco);
    }
    
    /**
     * Construtor de cópia para objetos da classe Equipa.
     */
    public Equipa(Equipa equipa)
    {
        this.nome = equipa.getNome();
        this.plantel = equipa.getPlantel();
        this.banco = equipa.getBanco();
    }
    
    /**
     * Getter para a variável nome ("Nome") de objetos da classe Equipa.
     */
    public String getNome()
    {
        return this.nome;
    }

    /**
     * Getter para o plantel de objetos da classe Equipa.
     */
    public Map<Integer,Jogador> getPlantel()
    {
        Map<Integer,Jogador> ret = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : plantel.entrySet())
        {
            ret.put(e.getKey(), e.getValue().clone());
        }

        return ret;
    }

    /**
     * Getter para o banco de objetos da classe Equipa.
     */
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
     * Setter para a variável nome ("Nome") de objetos da classe Equipa.
     */
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }
    
    /**
     * Setter para o plantel de objetos da classe Equipa.
     */
    public void setPlantel(Map<Integer, Jogador> nPlantel)
    {
        plantel = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : nPlantel.entrySet())
        {
            plantel.put(e.getKey(),e.getValue().clone());
        }
    }

    /**
     * Setter para o banco de objetos da classe Equipa.
     */
    public void setBanco(Map<Integer, Jogador> nBanco)
    {
        banco = new HashMap<>();

        for (Map.Entry<Integer,Jogador> e : nBanco.entrySet())
        {
            banco.put(e.getKey(),e.getValue().clone());
        }
    }
    
    /**
     * Método que calcula o valor correspondente à habilidade ("Habilidade") de objetos da classe Equipa, isto é, o valor que reflete a habilidade de uma equipa, tendo em conta os
     * valores de habilidade de cada objeto do tipo Jogador que integra essa mesma equipa.
     */
    public int calculaHabilidade()
    {
        int valor = 0;
        
        for (Jogador j : this.getPlantel().values())
        {
            valor += j.calculaHabilidade();
        }
        
        for (Jogador j : this.getBanco().values())
        {
            valor += j.calculaHabilidade();
        }
        
        return valor;
    }
    
    /**
     * Método clone para objetos da classe Equipa.
     */
    public Equipa clone()
    {
        return new Equipa(this);
    }
    
    /**
     * Método equals para objetos da classe Equipa.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        
        Equipa equipa = (Equipa) o;
        
        return (this.getNome() == equipa.getNome() && this.getPlantel().equals(equipa.getPlantel()) && this.getBanco().equals(equipa.getBanco()));
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Equipa
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nome: ");
        sb.append(this.getNome() + "\n");
        sb.append("Habilidade: ");
        sb.append(this.calculaHabilidade() + "\n");
        sb.append(this.getPlantel().toString());
        sb.append(this.getBanco().toString());
        
        return sb.toString();
    }
    
}