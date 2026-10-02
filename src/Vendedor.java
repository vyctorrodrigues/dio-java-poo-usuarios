public class Vendedor extends Usuario{

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void realizarVendas(){
        this.quantidadeVendas++;
        System.out.println("Venda realizada com sucesso!");
    }

    public void consultarVendas(){
        System.out.printf("Vendas: %s",getQuantidadeVendas());
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}
