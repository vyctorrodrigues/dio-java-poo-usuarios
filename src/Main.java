//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        var i1 = new Gerente("Vyctor","vyctor@.com","oiedse");
        var i2 = new Vendedor("Vyctoria","vyctoria@.com","uiseod");
        var i3 = new Atendente("Vyctoriaes","vyctoriaes@.com","uieeod");

        System.out.println("==LOGIN==");
        i1.realizarLogin();
        i2.realizarLogin();
        i3.realizarLogin();
        System.out.println("=================================");
        i2.realizarVendas();
        i2.realizarVendas();
        System.out.println("=================================");
        i3.receberPagamento(100);
        System.out.println("=================================");


        System.out.println("foram " + i2.getQuantidadeVendas() + " vendas realizadas");
        System.out.println("recebeu " + i3.getValorEmCaixa());
        i3.fecharCaixa();
        i1.gerarRelatorioFinanceiro();
    }
}