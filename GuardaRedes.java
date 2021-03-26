public class GuardaRedes extends Jogador{
    private int elasticidade;


    /* CONSTRUTORES */

    public GuardaRedes()
    {
        super();
        this.elasticidade = 0;
    }

    public GuardaRedes(int valorVelocidade, int valorResistencia, int valorDestreza, int valorImplusao, int valorJogoCabeca,
                        int valorRemate, int valorCapacidadePasse, int valorHabilidade, int elasticidade)
    {
        super(valorVelocidade, valorResistencia, valorDestreza, valorImplusao, valorJogoCabeca, valorRemate, valorCapacidadePasse, valorHabilidade);
        this.elasticidade = elasticidade;
    }

    public GuardaRedes(GuardaRedes gk)
    {
        super(gk);
        this.elasticidade = gk.getElasticidade();
    }

    /* GETTERS */

    public int getElasticidade() {
        return this.elasticidade;
    }

    /* SETTERS */

    public void setElasticidade(int elasticidade)
    {
        this.elasticidade = elasticidade;
    }

    /* ---------------------------------------------------------------------------------------------------------- */

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("Elasticidade: ").append(this.getElasticidade()).append("\n");

        return sb.toString();
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        GuardaRedes gk = (GuardaRedes) o;

        return super.equals(gk) && this.elasticidade == gk.getElasticidade();
    }

    public GuardaRedes clone()
    {
        return new GuardaRedes(this);
    }
}
