import java.io.IOException;
import java.util.Scanner;

public class View {
    private Controller c;

    public View(Controller c)
    {
        this.c = c;
    }

    public void run() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        Menu m = new Menu(new String [] {"...", "..."
                , "..." , "Gravar estado da aplicação num ficheiro"
                , "Ler estado da aplicação num ficheiro"});
        int op;

        do {
            m.executa();
            op = m.getOpcao();
            switch (op)
            {
                case 1:
                    // algo
                    break;
                case 2:
                    // algo
                    break;
                case 3:
                    // algo
                    break;
                case 4:
                    guardaEstado();
                    break;
                case 5:
                    carregaEstado();
                    break;
                default:
                    System.out.println("Ate ja");
                    break;
            }
        } while (op != 0);
    }

    private void guardaEstado()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do ficheiro:");
        String filename = sc.next();
        try {
            c.guardaEstado(filename);
        } catch (IOException e)
        {
            System.out.println("Nao foi possivel guardar o estado");
        }
    }

    private void carregaEstado()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do ficheiro:");
        String filename = sc.next();
        try {
            c.carregaEstado(filename);
        } catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Nao foi possivel carregar o estado");
        }
    }
}
