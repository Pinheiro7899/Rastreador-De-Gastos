package br.uam.mooca.planilha;

/**
 * Permite adicionar valores às categorias de gasto.
 * Herda os campos de Categoria.
 */
public class Gasto extends Categoria {

    public Gasto() {
        super(); // todos começam em 0.0
    }

    public Gasto(double lazer, double alimentacao,
                 double contas, double saude) {
        super(lazer, alimentacao, contas, saude);
    }

    /* Métodos de acumulação */
    public void adicionarLazer(double v)       { setLazer(getLazer() + v); }
    public void adicionarAlimentacao(double v) { setAlimentacao(getAlimentacao() + v); }
    public void adicionarContas(double v)      { setContas(getContas() + v); }
    public void adicionarSaude(double v)       { setSaude(getSaude() + v); }
}