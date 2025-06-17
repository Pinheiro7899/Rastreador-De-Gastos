package br.uam.mooca.cliente;

import br.uam.mooca.planilha.Gasto;
import br.uam.mooca.planilha.Usuario;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Demonstra o uso das classes Usuario, Gasto e Categoria.
 */
public class RelatorioDeGastos {

    public static void main(String[] args) {

        /* ==== Usuário ==== */
        Usuario usuario = new Usuario(
                "Cristiano Messi Junior",
                "cristianomessijunior@ballondor.goats",
                "Neymar710" // NÃO faça isso em produção!
        );

        System.out.println("===== DADOS DO USUÁRIO =====");
        System.out.println("Nome  : " + usuario.getNome());
        System.out.println("Email : " + usuario.getEmail());
        System.out.println("Senha : ********"); // não exibir senha real

        /* ==== Gastos ==== */
        Gasto gasto = new Gasto();
        gasto.adicionarLazer(1000.00);
        gasto.adicionarAlimentacao(1500.00);
        gasto.adicionarContas(600.00);
        gasto.adicionarSaude(1360.00);

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("\n===== RELATÓRIO DE GASTOS =====");
        System.out.println("Lazer       : " + nf.format(gasto.getLazer()));
        System.out.println("Alimentação : " + nf.format(gasto.getAlimentacao()));
        System.out.println("Contas      : " + nf.format(gasto.getContas()));
        System.out.println("Saúde       : " + nf.format(gasto.getSaude()));
        System.out.println("-------------------------------");
        System.out.println("TOTAL       : " + nf.format(gasto.getTotal()));
    }
}