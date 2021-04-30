
public class Jogo
{
    private Equipa equipa1;
    private Equipa equipa2;
    private int casa;
    private int visitante;

    public Jogo()
    {
        this.equipa1 = new Equipa();
        this.equipa2 = new Equipa();
        this.casa = 0;
        this.visitante = 0;
    }

    public Jogo(Equipa umaEquipa1, Equipa umaEquipa2, int valorCasa, int valorVisitante)
    {
        this.equipa1 = umaEquipa1.clone();
        this.equipa2 = umaEquipa2.clone();
        this.casa = valorCasa;
        this.visitante = valorVisitante;
    }
    
    public Jogo(Jogo umJogo)
    {
        this.equipa1 = umJogo.getEquipa1();
        this.equipa2 = umJogo.getEquipa2();
        this.casa = umJogo.getCasa();
        this.visitante = umJogo.getVisitante();
    }
    
    public Equipa getEquipa1()
    {
        return this.equipa1.clone();
    }
    
    public Equipa getEquipa2()
    {
        return this.equipa2.clone();
    }

    public int getCasa()
    {
        return this.casa;
    }
    
    public int getVisitante()
    {
        return this.visitante;
    }
    
    public void setEquipa1(Equipa umaEquipa1)
    {
        this.equipa1 = umaEquipa1.clone();
    }
    
    public void setEquipa2(Equipa umaEquipa2)
    {
        this.equipa2 = umaEquipa2.clone();
    }
    
    public void goloCasa()
    {
        this.casa += 1;
    }
    
    public void goloVisitante()
    {
        this.visitante += 1;
    }
    
    public Jogo clone()
    {
        return new Jogo(this);
    }
    
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        
        Jogo jogo = (Jogo) o;
        
        return (this.equipa1.equals(equipa2) && this.casa == jogo.getCasa() && this.visitante == jogo.getVisitante());
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.equipa1.getNome() + "\t");
        sb.append(this.getCasa() + " - ");
        sb.append(this.getVisitante() + "\t");
        sb.append(this.equipa2.getNome() + "\n");
        
        return sb.toString();
    }
    
}
