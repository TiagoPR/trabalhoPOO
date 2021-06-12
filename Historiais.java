import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Historiais
{
    private Map<Jogador,List<Equipa>> historiais;

    public Historiais()
    {
        this.historiais = new HashMap<>();
    }
    
    public Historiais(Map<Jogador,List<Equipa>> unsHistoriais)
    {
        this.setHistoriais(unsHistoriais);
    }
    
    public Historiais(Historiais hists)
    {
        this.historiais = hists.getHistoriais();
    }
    
    public Historiais getHistoriais()
    {
        Map<Jogador,List<Equipa>> h = new HashMap<>();
        
        for (Map.Entry<Jogador,List<Equipa>> e : this.historiais.entrySet())
        {
            List<Equipa> historial = new ArrayList<>();
            for (Equipa team : e.getValue())
            {
                historialteam.clone();
            }
            ret.put(e.getKey(), e.getValue().clone());
        }
    }
    
    public void setHistoriais(Map<Jogador,List<Equipa>> novosHistoriais)
    {
        
    }
    
    public Historiais clone()
    {
        return new Historiais(this);
    }
    
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        
        Transferencia trans = (Transferencia) o;
        
        return this.getVendedora().equals(trans.getVendedora()) && this.getCompradora().equals(trans.getCompradora());
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append();
        sb.append();
        sb.append();
        sb.append();
        sb.append();
        sb.append();
        
        return sb.toString();
    }
    
    public void transferencia(Equipa aVendedora, Equipa aCompradora)
    {
        if (aVendedora.getPlantel().containsValue(this))
        {
            aCompradora.banco.put(this.clone());
            
        }
    }






}
