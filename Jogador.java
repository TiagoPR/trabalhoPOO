
public abstract class Jogador
{
    private String nome;
    private int velocidade;
    private int resistencia;
    private int destreza;
    private int impulsao;
    private int jogoCabeca;
    private int remate;
    private int capacidadePasse;

    /**
     * Construtor por omissão não especializado para objetos do tipo Jogador.
     */
    public Jogador()
    {
        this.nome = "";
        this.velocidade = 0;
        this.resistencia = 0;
        this.destreza = 0;
        this.impulsao = 0;
        this.jogoCabeca = 0;
        this.remate = 0;
        this.capacidadePasse = 0;
    }
    
    /**
     * Construtor parametrizado não especializado para objetos do tipo Jogador.
     */
    public Jogador(String umNome, int valorVelocidade, int valorResistencia, int valorDestreza, int valorImpulsao, int valorJogoCabeca, int valorRemate, int valorCapacidadePasse)
    {
        this.nome = umNome;
        this.velocidade = valorVelocidade;
        this.resistencia = valorResistencia;
        this.destreza = valorDestreza;
        this.impulsao = valorImpulsao;
        this.jogoCabeca = valorJogoCabeca;
        this.remate = valorRemate;
        this.capacidadePasse = valorCapacidadePasse;
    }
    
    /**
     * Construtor de cópia não especializado para objetos do tipo Jogador.
     */
    public Jogador(Jogador jogador)
    {
        this.nome = jogador.getNome();
        this.velocidade = jogador.getVelocidade();
        this.resistencia = jogador.getResistencia();
        this.destreza = jogador.getDestreza();
        this.impulsao = jogador.getImpulsao();
        this.jogoCabeca = jogador.getJogoCabeca();
        this.remate = jogador.getRemate();
        this.capacidadePasse = jogador.getCapacidadePasse();
    }
    
    /**
     * Getter para a variável nome ("Nome") de objetos do tipo Jogador.
     */
    public String getNome()
    {
        return this.nome;
    }
    
    /**
     * Getter para a variável velocidade ("Velocidade") de objetos do tipo Jogador.
     */
    public int getVelocidade()
    {
        return this.velocidade;
    }
    
    /**
     * Getter para a variável resistencia ("Resistência") de objetos do tipo Jogador.
     */
    public int getResistencia()
    {
        return this.resistencia;
    }
    
    /**
     * Getter para a variável destreza ("Destreza") de objetos do tipo Jogador.
     */
    public int getDestreza()
    {
        return this.destreza;
    }
    
    /**
     * Getter para a variável impulsao ("Impulsão") de objetos do tipo Jogador.
     */
    public int getImpulsao()
    {
        return this.impulsao;
    }
    
    /**
     * Getter para a variável jogoCabeca ("Jogo de cabeça") de objetos do tipo Jogador.
     */
    public int getJogoCabeca()
    {
        return this.jogoCabeca;
    }
    
    /**
     * Getter para a variável remate ("Remate") de objetos do tipo Jogador.
     */
    public int getRemate()
    {
        return this.remate;
    }
    
    /**
     * Getter para a variável capacidadePasse ("Capacidade de passe") de objetos do tipo Jogador.
     */
    public int getCapacidadePasse()
    {
        return this.capacidadePasse;
    }
    
    /**
     * Setter para a variável nome ("Nome") de objetos do tipo Jogador.
     */
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }
    
    /**
     * Setter para a variável velocidade ("Velocidade") de objetos do tipo Jogador.
     */
    public void setVelocidade(int novaVelocidade)
    {
        this.velocidade = novaVelocidade;
    }
    
    /**
     * Setter para a variável resistencia ("Resistência") de objetos do tipo Jogador.
     */
    public void setResistencia(int novaResistencia)
    {
        this.resistencia = novaResistencia;
    }
    
    /**
     * Setter para a variável destreza ("Destreza") de objetos do tipo Jogador.
     */
    public void setDestreza(int novaDestreza)
    {
        this.destreza = novaDestreza;
    }
    
    /**
     * Setter para a variável impulsao ("Impulsão") de objetos do tipo Jogador.
     */
    public void setImpulsao(int novaImpulsao)
    {
        this.impulsao = novaImpulsao;
    }
    
    /**
     * Setter para a variável jogoCabeca ("Jogo de cabeça") de objetos do tipo Jogador.
     */
    public void setJogoCabeca(int novoJogoCabeca)
    {
        this.jogoCabeca = novoJogoCabeca;
    }
    
    /**
     * Setter para a variável remate ("Remate") de objetos do tipo Jogador.
     */
    public void setRemate(int novoRemate)
    {
        this.remate = novoRemate;
    }
    
    /**
     * Setter para a variável capacidadePasse ("Capacidade de passe") de objetos do tipo Jogador.
     */
    public void setCapacidadePasse(int novaCapacidadePasse)
    {
        this.capacidadePasse = novaCapacidadePasse;
    }
    
    /**
     * Método abstrato implementado em cada uma das subclasses da classe Jogador, atendendo às especificidades de cada uma delas, de forma a calcular o valor correspondente à
     * habilidade ("Habilidade") de cada jogador, isto é, de cada objeto do tipo Jogador.
     */
    public abstract int calculaHabilidade();
    
    /**
     * Método clone abstrato para objetos do tipo Jogador, implementado em cada uma das subclasses da classe Jogador.
     */
    public abstract Jogador clone();
    
    /**
     * Método equals não especializado para objetos do tipo Jogador.
     */
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        
        Jogador jogador = (Jogador) o;
        
        return (this.getNome() == jogador.getNome() && this.getVelocidade() == jogador.getVelocidade() && this.getResistencia() == jogador.getResistencia() && 
                this.getDestreza() == jogador.getDestreza() && this.getImpulsao() == jogador.getImpulsao() && this.getJogoCabeca() == jogador.getJogoCabeca() && 
                this.getRemate() == jogador.getRemate() && this.getCapacidadePasse() == jogador.getCapacidadePasse());
    }
    
    /**
     * Método não especializado que devolve a representação em String de um objeto do tipo Jogador.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nome: ");
        sb.append(this.getNome() + "\n");
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
        
        return sb.toString();
    }
    
}