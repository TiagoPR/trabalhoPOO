import java.io.*;

public class Jogo
{
    private Equipa equipa1;
    private Equipa equipa2;
    private int casa;
    private int visitante;
    private boolean comecou;
    private boolean intervalo;

    public Jogo()
    {
        this.equipa1 = new Equipa();
        this.equipa2 = new Equipa();
        this.casa = 0;
        this.visitante = 0;
        this.comecou = false;
        this.intervalo = false;
    }

    public Jogo(Equipa umaEquipa1, Equipa umaEquipa2, int valorCasa, int valorVisitante, boolean comecou, boolean intervalo)
    {
        this.equipa1 = umaEquipa1.clone();
        this.equipa2 = umaEquipa2.clone();
        this.casa = valorCasa;
        this.visitante = valorVisitante;
        this.comecou = comecou;
        this.intervalo = intervalo;
    }

    public Jogo(Equipa umaEquipa1, Equipa umaEquipa2)
    {
        this.equipa1 = umaEquipa1.clone();
        this.equipa2 = umaEquipa2.clone();
        this.casa = 0;
        this.visitante = 0;
        this.comecou = false;
        this.intervalo = false;
    }
    
    public Jogo(Jogo umJogo)
    {
        this.equipa1 = umJogo.getEquipa1();
        this.equipa2 = umJogo.getEquipa2();
        this.casa = umJogo.getCasa();
        this.visitante = umJogo.getVisitante();
        this.comecou = umJogo.getEstado();
        this.intervalo = umJogo.getIntervalo();
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

    public boolean getEstado()
    {
        return this.comecou;
    }

    public boolean getIntervalo()
    {
        return this.intervalo;
    }
    
    public void setEquipa1(Equipa umaEquipa1)
    {
        this.equipa1 = umaEquipa1.clone();
    }
    
    public void setEquipa2(Equipa umaEquipa2)
    {
        this.equipa2 = umaEquipa2.clone();
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
        
        return (this.getEquipa1().equals(jogo.getEquipa1()) && this.getEquipa2().equals(jogo.getEquipa2()) &&
                this.getCasa() == jogo.getCasa() && this.getVisitante() == jogo.getVisitante());
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.getEquipa1().getNome() + "\t");
        sb.append(this.getCasa() + " - ");
        sb.append(this.getVisitante() + "\t");
        sb.append(this.getEquipa2().getNome() + "\n");
        
        return sb.toString();
    }

    /*
            Métodos adicionais
     */

    public void goloCasa()
    {
        if (comecou && !intervalo) this.casa += 1;
    }

    public void goloVisitante()
    {
        if (comecou && !intervalo) this.visitante += 1;
    }

    public void tentativaGolo(Equipa e)
    {
        // ainda por implementar
    }

    public void toCSV(String fileName) throws FileNotFoundException {
        PrintWriter fich = new PrintWriter(fileName);

        fich.println(equipa1.toString() + "\n");
        fich.println(equipa2.toString());

        fich.flush();
        fich.close();
    }

    public void guardaEstado(String fileName) throws IOException
    {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);

        oos.flush();
        oos.close();
    }

    public static Jogo carregaEstado(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Jogo j = (Jogo) ois.readObject();

        ois.close();
        return j;
    }
    
}
