package br.uam.mooca.planilha;

/**
 * Guarda os valores de cada categoria de gasto.
 * Para simplificar usamos double; para produção use BigDecimal.
 */
public class Categoria {

    /* Valores de cada categoria */
    private double lazer;
    private double alimentacao;
    private double contas;
    private double saude;

    /* Construtores */
    public Categoria() {}

    public Categoria(double lazer, double alimentacao,
                     double contas, double saude) {
        this.lazer        = lazer;
        this.alimentacao  = alimentacao;
        this.contas       = contas;
        this.saude        = saude;
    }

    /* Getters */
    public double getLazer()        { return lazer; }
    public double getAlimentacao()  { return alimentacao; }
    public double getContas()       { return contas; }
    public double getSaude()        { return saude; }

    /** Total é calculado dinamicamente. */
    public double getTotal() {
        return lazer + alimentacao + contas + saude;
    }

    /* protected setters usados pela subclasse Gasto */
    protected void setLazer(double v)       { this.lazer = v; }
    protected void setAlimentacao(double v) { this.alimentacao = v; }
    protected void setContas(double v)      { this.contas = v; }
    protected void setSaude(double v)       { this.saude = v; }
}