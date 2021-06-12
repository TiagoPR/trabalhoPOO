import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * The test class EquipaTest.
 */
public class EquipaTest {

    Map<Integer,Jogador> plantel;
    Map<Integer,Jogador> banco;

    /**
     * Default constructor for test class EquipaTest
     */
    public EquipaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        plantel = new HashMap<>();

        GuardaRedes g = new GuardaRedes("Quim",58,45,94,36,6,59,47,75);
        Lateral ld = new Lateral("Quim",61,58,58,61,37,95,55,88);
        Defesa dc = new Defesa("Quim",60,59,56,51,52,67,59,42);
        Defesa dc2 = new Defesa("Quim",49,51,91,64,58,14,75,42);
        Lateral le = new Lateral("Quim",53,62,56,64,0,92,59,14);
        Medio mc = new Medio("Quim",68,66,96,74,69,57,76,61);
        Medio mc2 = new Medio("Quim",67,73,61,72,73,54,43,4);
        Medio md = new Medio("Quim",56,75,84,63,65,56,69,66);
        Medio me = new Medio("Quim",59,3,1,88,52,54,72,66);
        Avancado ac = new Avancado("Quim",68,31,13,65,30,61,71,70);
        Avancado ac2 = new Avancado("Quim",90,73,56,60,41,72,53,63);

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

        banco = new HashMap<>();

        Lateral ldb = new Lateral("Joca",53,71,63,45,5,63,66,77);
        Defesa dcb = new Defesa("Joca",58,72,52,51,61,57,51,60);
        Defesa dc2b = new Defesa("Joca",40,58,24,70,53,54,89,65);
        Lateral leb = new Lateral("Joca",71,58,70,0,71,73,84,50);
        Medio mcb = new Medio("Joca",3,64,69,54,59,49,90,75);
        Medio mc2b = new Medio("Joca",57,66,70,96,60,74,68,22);
        Medio mdb = new Medio("Joca",89,63,59,66,60,50,25,40);
        Medio meb = new Medio("Joca",28,64,54,87,21,83,82,72);
        Avancado acb = new Avancado("Joca",55,54,8,93,94,70,68,60);

        banco.put(40,ldb);
        banco.put(41,dcb);
        banco.put(50,dc2b);
        banco.put(22,leb);
        banco.put(7,mcb);
        banco.put(10,mc2b);
        banco.put(99,mdb);
        banco.put(32,meb);
        banco.put(4,acb);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testContructor() {
        Equipa eq1 = new Equipa();
        assertTrue(eq1!=null);

        Equipa eq2 = new Equipa("Braga FC",plantel,banco);
        assertTrue(eq2.getPlantel()!=null);
        assertTrue(eq2.getBanco()!=null);
        assertTrue(plantel.containsKey(9));
        assertTrue(banco.containsKey(4));
    }

    @Test
    public void testSubstituicao()
    {
        Equipa eq2 = new Equipa("Braga FC",plantel,banco);
        eq2.substituicão(9,4);
        assertTrue(eq2.getPlantel().containsKey(4) && eq2.getBanco().containsKey(9));
        assertTrue(!eq2.getBanco().containsKey(4) && !eq2.getPlantel().containsKey(9));
    }

}