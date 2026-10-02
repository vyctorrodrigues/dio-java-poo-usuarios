public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private Boolean isAdmin;


    public Usuario(String nome, String email, String senha, Boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }



    public void alterarSenha(String senha) {
        this.senha = senha;
    }

    public void alterarDados(String novoNome, String novoEmail, String novoSenha) {
        this.nome = novoNome;
        this.email = novoEmail;
        this.senha = novoSenha;
    }

    public void realizarLogin(){
        System.out.printf("Usuário %s realizou o login no sistema.\n", getNome());
    }

    public void realizarLogoff(){
        System.out.printf("Usuário %s realizou logoff.", getNome());
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }
}
