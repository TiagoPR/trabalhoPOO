
/**
 * Escreva a descrição da classe Jogador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Jogador
{
    private int velocidade;
    private int resistencia;
    private int destreza;
    private int impulsao;
    private int jogoCabeca;
    private int remate;
    private int capacidadePasse;
    private int habilidade;

    /**
     * Construtor por omissão para objetos da classe Jogador.
     */
    public Jogador()
    {
        this.velocidade = 0;
        this.resistencia = 0;
        this.destreza = 0;
        this.impulsao = 0;
        this.jogoCabeca = 0;
        this.remate = 0;
        this.capacidadePasse = 0;
        this.habilidade = 0;
    }
    
    /**
     * Construtor parametrizado para objetos da classe Jogador.
     */
    public Jogador(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse, int valorHabilidade)
    {
        this.velocidade = valorVelocidade;
        this.resistencia = valorResistencia;
        this.destreza = valorDestreza;
        this.impulsao = valorImpulsao;
        this.jogoCabeca = valorJogoCabeca;
        this.remate = valorRemate;
        this.capacidadePasse = valorCapacidadePasse;
        this.habilidade = valorHabilidade;
    }
    
    /**
     * Construtor de cópia para objetos da classe Jogador.
     */
    public Jogador(Jogador jogador)
    {
        this.velocidade = jogador.getVelocidade();
        this.resistencia = jogador.getResistencia();
        this.destreza = jogador.getDestreza();
        this.impulsao = jogador.getImpulsao();
        this.jogoCabeca = jogador.getJogoCabeca();
        this.remate = jogador.getRemate();
        this.capacidadePasse = jogador.getCapacidadePasse();
        this.habilidade = jogador.getHabilidade();
    }
    
    /**
     * Getter para a variável velocidade ("Velocidade") de objetos da classe Jogador.
     */
    public int getVelocidade()
    {
        return this.velocidade;
    }
    
    /**
     * Getter para a variável resistencia ("Resistência") de objetos da classe Jogador.
     */
    public int getResistencia()
    {
        return this.resistencia;
    }
    
    /**
     * Getter para a variável destreza ("Destreza") de objetos da classe Jogador.
     */
    public int getDestreza()
    {
        return this.destreza;
    }
    
    /**
     * Getter para a variável impulsao ("Impulsão") de objetos da classe Jogador.
     */
    public int getImpulsao()
    {
        return this.impulsao;
    }
    
    /**
     * Getter para a variável jogoCabeca ("Jogo de cabeça") de objetos da classe Jogador.
     */
    public int getJogoCabeca()
    {
        return this.jogoCabeca;
    }
    
    /**
     * Getter para a variável remate ("Remate") de objetos da classe Jogador.
     */
    public int getRemate()
    {
        return this.remate;
    }
    
    /**
     * Getter para a variável capacidadePasse ("Capacidade de Passe") de objetos da classe Jogador.
     */
    public int getCapacidadePasse()
    {
        return this.capacidadePasse;
    }
    
    /**
     * Getter para a variável habilidade ("Habilidade") de objetos da classe Jogador.
     */
    public int getHabilidade()
    {
        return this.habilidade;
    }
    
    /**
     * Setter para a variável velocidade ("Velocidade") de objetos da classe Jogador.
     */
    public void setVelocidade(int novaVelocidade)
    {
        this.velocidade = novaVelocidade;
    }
    
    /**
     * Setter para a variável resistencia ("Resistência") de objetos da classe Jogador.
     */
    public void setResistencia(int novaResistencia)
    {
        this.resistencia = novaResistencia;
    }
    
    /**
     * Setter para a variável destreza ("Destreza") de objetos da classe Jogador.
     */
    public void setDestreza(int novaDestreza)
    {
        this.destreza = novaDestreza;
    }
    
    /**
     * Setter para a variável impulsao ("Impulsão") de objetos da classe Jogador.
     */
    public void setImpulsao(int novaImpulsao)
    {
        this.impulsao = novaImpulsao;
    }
    
    /**
     * Setter para a variável jogoCabeca ("Jogo de cabeça") de objetos da classe Jogador.
     */
    public void setJogoCabeca(int novoJogoCabeca)
    {
        this.jogoCabeca = novoJogoCabeca;
    }
    
    /**
     * Setter para a variável remate ("Remate") de objetos da classe Jogador.
     */
    public void setRemate(int novoRemate)
    {
        this.remate = novoRemate;
    }
    
    /**
     * Setter para a variável capacidadePasse ("Capacidade de Passe") de objetos da classe Jogador.
     */
    public void setCapacidadePasse(int novaCapacidadePasse)
    {
        this.capacidadePasse = novaCapacidadePasse;
    }
    
    /**
     * Setter para a variável habilidade ("Habilidade") de objetos da classe Jogador.
     */
    public void setHabilidade(int novaHabilidade)
    {
        this.habilidade = novaHabilidade;
    }
    
    /**
     * Método clone para objetos da classe Jogador.
     */
    public Jogador clone()
    {
        return new Jogador(this);
    }
    
    /**
     * Método equals para objetos da classe Jogador.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        Jogador jogador = (Jogador) o;
        return (this.getVelocidade() == jogador.getVelocidade() && this.getResistencia() == jogador.getResistencia() && this.getDestreza() == jogador.getDestreza() && 
                this.getImpulsao() == jogador.getImpulsao() && this.getJogoCabeca() == jogador.getJogoCabeca() && this.getRemate() == jogador.getRemate() && 
                this.getCapacidadePasse() == jogador.getCapacidadePasse() && this.getHabilidade() == jogador.getHabilidade());
    }
    
    /**
     * Método que devolve a representação em String de um objeto da classe Jogador.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Velocidade: ");
        sb.append(this.getVelocidade() + "\n");
        sb.append("Resistência: ");
        sb.append(this.getResistencia() + "\n");
        sb.append("Destreza: ");
        sb.append(this.getDestreza() + "\n");
        sb.append("Impulsão: ");
        sb.append(this.getImpulsao() + "\n");
        sb.append("Jogo de cabeça: ");
        sb.append(this.getJogoCabeca() + "\n");
        sb.append("Remate: ");
        sb.append(this.getRemate() + "\n");
        sb.append("Capacidade de passe: ");
        sb.append(this.getCapacidadePasse() + "\n");
        sb.append("Habilidade: ");
        sb.append(this.getHabilidade() + "\n");
        
        return sb.toString();
    }
    
}