public class Cliente {
        
    private String nome;
    private int senha;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}
