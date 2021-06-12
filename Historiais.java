import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

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
    
    public Map<Jogador,List<Equipa>> getHistoriais()
    {
        Map<Jogador,List<Equipa>> h = new HashMap<>();
        
        for (Map.Entry<Jogador,List<Equipa>> e : this.historiais.entrySet())
        {
            List<Equipa> historial = new ArrayList<>();
            
            for (Equipa team : e.getValue())
            {
                historial.add(team.clone());
            }
            
            h.put(e.getKey().clone(), historial);
        }
        
        return h;
    }
    
    public void setHistoriais(Map<Jogador,List<Equipa>> novosHistoriais)
    {
        Map<Jogador,List<Equipa>> h = new HashMap<>();
        
        for (Map.Entry<Jogador,List<Equipa>> e : novosHistoriais.entrySet())
        {
            List<Equipa> historial = new ArrayList<>();
            
            for (Equipa team : e.getValue())
            {
                historial.add(team.clone());
            }
            
            h.put(e.getKey().clone(), historial);
        }
        
        this.historiais = h;
    }
    
    public Historiais clone()
    {
        return new Historiais(this);
    }
    
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        
        Historiais hists = (Historiais) o;
        
        return this.getHistoriais().equals(hists.getHistoriais());
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        for (Map.Entry<Jogador,List<Equipa>> e : this.getHistoriais().entrySet())
        {
            sb.append("Jogador: ");
            sb.append(e.getKey().toString());
            sb.append("Historial de equipas: ");
            sb.append(e.getValue().stream().map(team -> team.getNome()).collect(Collectors.toList()).toString());            
        }
        
        return sb.toString();
    }
    
}
