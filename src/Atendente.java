public class Atendente extends Usuario {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void receberPagamento(double valor){
        valorEmCaixa += valor;
    }

    public void fecharCaixa(){
        valorEmCaixa = 0.0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
