
package Usuario;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String deficiencia;

    public Usuario() {
    }

    // LOGIN
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

 
    public Usuario(String nome, String email, String senha, String deficiencia) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.deficiencia = deficiencia;
    }

    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getNome() { return nome; }
    public String getDeficiencia() { return deficiencia; }

    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDeficiencia(String deficiencia) { this.deficiencia = deficiencia; }
}