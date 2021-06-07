import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Jogador> plantel = new HashMap<>();

        GuardaRedes g = new GuardaRedes(58,45,94,36,6,59,47,75);
        Lateral ld = new Lateral(61,58,58,61,37,95,55,88);
        Defesa dc = new Defesa(60,59,56,51,52,67,59,42);
        Defesa dc2 = new Defesa(49,51,91,64,58,14,75,42);
        Lateral le = new Lateral(53,62,56,64,0,92,59,14);
        Medio mc = new Medio(68,66,96,74,69,57,76,61);
        Medio mc2 = new Medio(67,73,61,72,73,54,43,4);
        Medio md = new Medio(56,75,84,63,65,56,69,66);
        Medio me = new Medio(59,3,1,88,52,54,72,66);
        Avancado ac = new Avancado(68,31,13,65,30,61,71,70);
        Avancado ac2 = new Avancado(90,73,56,60,41,72,53,63);

        plantel.put(38,g);
        plantel.put(29,ld);
        plantel.put(48,dc);
        plantel.put(8,dc2);
        plantel.put(20,le);
        plantel.put(17,mc);
        plantel.put(12,mc2);
        plantel.put(11,md);
        plantel.put(21,me);
        plantel.put(9,ac);
        plantel.put(2,ac2);

        Map<Integer,Jogador> banco = new HashMap<>();

        Lateral ldb = new Lateral(53,71,63,45,5,63,66,77);
        Defesa dcb = new Defesa(58,72,52,51,61,57,51,60);
        Defesa dc2b = new Defesa(40,58,24,70,53,54,89,65);
        Lateral leb = new Lateral(71,58,70,0,71,73,84,50);
        Medio mcb = new Medio(3,64,69,54,59,49,90,75);
        Medio mc2b = new Medio(57,66,70,96,60,74,68,22);
        Medio mdb = new Medio(89,63,59,66,60,50,25,40);
        Medio meb = new Medio(28,64,54,87,21,83,82,72);
        Avancado acb = new Avancado(55,54,8,93,94,70,68,60);

        banco.put(40,ldb);
        banco.put(41,dcb);
        banco.put(50,dc2b);
        banco.put(22,leb);
        banco.put(7,mcb);
        banco.put(10,mc2b);
        banco.put(99,mdb);
        banco.put(32,meb);
        banco.put(4,acb);

        Equipa e1 = new Equipa("Braga FC", plantel,banco);

        // 2º Equipa

        Map<Integer,Jogador> plantel1 = new HashMap<>();

        GuardaRedes g1 = new GuardaRedes(58,45,94,36,6,59,47,75);
        Lateral ld1 = new Lateral(61,58,58,61,37,95,55,88);
        Defesa dc1 = new Defesa(60,59,56,51,52,67,59,42);
        Defesa dc21 = new Defesa(49,51,91,64,58,14,75,42);
        Lateral le1 = new Lateral(53,62,56,64,0,92,59,14);
        Medio mc1 = new Medio(68,66,96,74,69,57,76,61);
        Medio mc21 = new Medio(67,73,61,72,73,54,43,4);
        Medio md1 = new Medio(56,75,84,63,65,56,69,66);
        Medio me1 = new Medio(59,3,1,88,52,54,72,66);
        Avancado ac1 = new Avancado(68,31,13,65,30,61,71,70);
        Avancado ac21 = new Avancado(90,73,56,60,41,72,53,63);

        plantel1.put(38,g1);
        plantel1.put(29,ld1);
        plantel1.put(48,dc1);
        plantel1.put(8,dc21);
        plantel1.put(20,le1);
        plantel1.put(17,mc1);
        plantel1.put(12,mc21);
        plantel1.put(11,md1);
        plantel1.put(21,me1);
        plantel1.put(9,ac1);
        plantel1.put(2,ac21);

        Map<Integer,Jogador> banco1 = new HashMap<>();

        Lateral ldb1 = new Lateral(53,71,63,45,5,63,66,77);
        Defesa dcb1 = new Defesa(58,72,52,51,61,57,51,60);
        Defesa dc2b1 = new Defesa(40,58,24,70,53,54,89,65);
        Lateral leb1 = new Lateral(71,58,70,0,71,73,84,50);
        Medio mcb1 = new Medio(3,64,69,54,59,49,90,75);
        Medio mc2b1 = new Medio(57,66,70,96,60,74,68,22);
        Medio mdb1 = new Medio(89,63,59,66,60,50,25,40);
        Medio meb1 = new Medio(28,64,54,87,21,83,82,72);
        Avancado acb1 = new Avancado(55,54,8,93,94,70,68,60);

        banco1.put(40,ldb1);
        banco1.put(41,dcb1);
        banco1.put(50,dc2b1);
        banco1.put(22,leb1);
        banco1.put(7,mcb1);
        banco1.put(10,mc2b1);
        banco1.put(99,mdb1);
        banco1.put(32,meb1);
        banco1.put(4,acb1);

        Equipa e2 = new Equipa("Guimaraes FC", plantel1, banco1);

        Jogo j = new Jogo(e1,e2);

        try {
            j.toCSV("equipas.csv");
            System.out.println("Ficheiro CSV criado com succeso!");
        }
        catch (IOException e)
        {
            System.out.println("Não foi possível criar o ficheiro CSV!");
        }
    }
}
