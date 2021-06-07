import java.io.IOException;

/**
 * Controlador do modelo MVC
 */

public class Controller {
    private Jogo j;

    public Controller(Jogo j)
    {
        this.j = j;
    }

    public void guardaEstado(String filename) throws IOException
    {
        j.guardaEstado(filename);
    }

    public void carregaEstado(String filename) throws ClassNotFoundException,IOException
    {
        j = Jogo.carregaEstado(filename);
    }
}
