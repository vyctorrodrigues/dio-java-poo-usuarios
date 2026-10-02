public class Gerente extends Usuario{


    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha,true);
    }

    public void gerarRelatorioFinanceiro(){
        System.out.printf("O Gerente %s gerou o relatorio.", getNome());
    }

    public void consultarVendas(){
        System.out.println("Consultando Vendas");
    }
}
